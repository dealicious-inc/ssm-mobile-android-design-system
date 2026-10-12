#!/usr/bin/env python3
"""svg2vectordrawable 결과물을 디자인시스템 drawable 컨벤션에 맞게 정규화한다.

- 속성 없는 <group> 언랩, 전체 viewport clip-path 제거
- 단색 아이콘이면 색상을 #000000 으로 통일 (사용처에서 tint)
- 다색 아이콘이면 색상 유지 + MULTICOLOR 경고
- Android Studio Vector Asset 과 동일한 들여쓰기/속성 순서로 출력

usage: normalize_vd.py <in.xml> <out.xml>
stdout 마지막 줄에 요약 JSON 을 출력한다.
"""
import json
import re
import sys
import xml.etree.ElementTree as ET

A = "http://schemas.android.com/apk/res/android"
ET.register_namespace("android", A)
COLOR_ATTRS = ("fillColor", "strokeColor")
TRANSPARENT = {"#00000000"}
# Android Studio 출력 기준 속성 순서. 나머지는 원래 순서 유지.
ATTR_ORDER = ["name", "pathData", "fillColor", "strokeColor", "strokeWidth",
              "strokeLineCap", "strokeLineJoin", "fillType", "fillAlpha", "strokeAlpha"]


def q(name):
    return f"{{{A}}}{name}"


def norm_color(c):
    c = c.strip()
    if re.fullmatch(r"#[0-9A-Fa-f]{8}", c) and c[1:3].upper() == "FF":
        c = "#" + c[3:]
    elif re.fullmatch(r"#[0-9A-Fa-f]{3}", c):
        c = "#" + "".join(ch * 2 for ch in c[1:])
    return c.upper() if c.upper() != "#00000000" else "#00000000"


def is_full_clip(el, vw, vh):
    d = re.sub(r"\s+", "", el.get(q("pathData"), ""))
    full = {f"M0,0h{vw}v{vh}h-{vw}z", f"M0,0H{vw}V{vh}H0Z", f"M0,0h{vw}v{vh}H0z", f"M0,0H{vw}V{vh}H0V0Z"}
    return d in full


def unwrap(parent, vw, vh):
    out = []
    for child in list(parent):
        if child.tag == "clip-path" and is_full_clip(child, vw, vh):
            continue
        if child.tag == "group" and not child.attrib:
            unwrap(child, vw, vh)
            # 그룹 안에 clip-path 가 남아 있으면 의미가 있으므로 유지
            if any(c.tag == "clip-path" for c in child):
                out.append(child)
            else:
                out.extend(list(child))
            continue
        if child.tag == "group":
            unwrap(child, vw, vh)
        out.append(child)
    for c in list(parent):
        parent.remove(c)
    parent.extend(out)


def ordered_attrs(el):
    items = []
    for k, v in el.attrib.items():
        local = k.split("}")[-1]
        items.append((local, v))
    rank = {n: i for i, n in enumerate(ATTR_ORDER)}
    return sorted(items, key=lambda kv: rank.get(kv[0], len(ATTR_ORDER)))


def serialize(root):
    lines = [f'<vector xmlns:android="{A}"']
    root_attrs = [(k.split("}")[-1], v) for k, v in root.attrib.items()]
    for i, (k, v) in enumerate(root_attrs):
        end = ">" if i == len(root_attrs) - 1 else ""
        lines.append(f'    android:{k}="{v}"{end}')

    def emit(el, depth):
        pad = "  " * depth
        attrs = ordered_attrs(el)
        children = list(el)
        if not attrs:
            lines.append(f"{pad}<{el.tag}>" if children else f"{pad}<{el.tag}/>")
        else:
            lines.append(f"{pad}<{el.tag}")
            for i, (k, v) in enumerate(attrs):
                last = i == len(attrs) - 1
                end = (">" if children else "/>") if last else ""
                lines.append(f'{pad}    android:{k}="{v}"{end}')
        if children:
            for c in children:
                emit(c, depth + 1)
            lines.append(f"{pad}</{el.tag}>")

    for c in root:
        emit(c, 1)
    lines.append("</vector>")
    return "\n".join(lines) + "\n"


def main(src, dst):
    root = ET.parse(src).getroot()
    vw = root.get(q("viewportWidth"))
    vh = root.get(q("viewportHeight"))
    unwrap(root, vw, vh)

    colors = set()
    for el in root.iter():
        for a in COLOR_ATTRS:
            if q(a) in el.attrib:
                c = norm_color(el.attrib[q(a)])
                el.attrib[q(a)] = c
                if c not in TRANSPARENT:
                    colors.add(c)

    multicolor = len(colors) > 1
    if not multicolor:
        for el in root.iter():
            for a in COLOR_ATTRS:
                if q(a) in el.attrib and el.attrib[q(a)] not in TRANSPARENT:
                    el.attrib[q(a)] = "#000000"

    with open(dst, "w", encoding="utf-8") as f:
        f.write(serialize(root))

    warnings = []
    if multicolor:
        warnings.append(f"MULTICOLOR: 색상 {sorted(colors)} 유지됨 (tint 적용 시 단색으로 덮어써짐)")
    if root.get(q("width")) != "24dp" or root.get(q("height")) != "24dp":
        warnings.append(f"SIZE: {root.get(q('width'))}x{root.get(q('height'))} (기본 24dp 아님)")
    if any(el.tag in ("image", "bitmap") for el in root.iter()):
        warnings.append("RASTER: 비트맵 요소 포함")

    print(json.dumps({
        "file": dst,
        "size": f"{root.get(q('width'))}x{root.get(q('height'))}",
        "viewport": f"{vw}x{vh}",
        "colors": sorted(colors),
        "multicolor": multicolor,
        "warnings": warnings,
    }, ensure_ascii=False))


if __name__ == "__main__":
    if len(sys.argv) != 3:
        sys.exit(__doc__)
    main(sys.argv[1], sys.argv[2])
