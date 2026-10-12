#!/usr/bin/env python3
"""Figma MCP export SVG 에 섞여 오는 배경 요소를 제거한다.

Figma export 는 아이콘 외에 프레임 배경, 상위 프레임(카드)의 rect, 컴포넌트 자체 배경 rect 를
함께 그려서 내보낸다. viewBox 전체를 덮는 <rect> 는 아이콘 도형이 아니므로 모두 제거한다.
또한 circle/ellipse/rect/line/polygon/polyline 을 <path> 로 바꾼다 (변환기가 기본 도형을 버림).

usage: clean_figma_svg.py <in.svg> <out.svg>
stdout 에 제거한 요소 수를 출력한다.
"""
import sys
import xml.etree.ElementTree as ET

SVG = "http://www.w3.org/2000/svg"
ET.register_namespace("", SVG)


def num(v, default=0.0):
    try:
        return float(str(v).replace("px", ""))
    except (TypeError, ValueError):
        return default


def covers_viewbox(rect, vx, vy, vw, vh):
    if rect.get("transform"):
        return False
    x, y = num(rect.get("x")), num(rect.get("y"))
    w, h = num(rect.get("width"), -1), num(rect.get("height"), -1)
    return x <= vx and y <= vy and x + w >= vx + vw and y + h >= vy + vh


def fmt(v):
    return f"{v:.5f}".rstrip("0").rstrip(".")


def ellipse_d(cx, cy, rx, ry):
    return (f"M{fmt(cx - rx)},{fmt(cy)}"
            f"A{fmt(rx)},{fmt(ry)} 0 1,0 {fmt(cx + rx)},{fmt(cy)}"
            f"A{fmt(rx)},{fmt(ry)} 0 1,0 {fmt(cx - rx)},{fmt(cy)}Z")


def rect_d(x, y, w, h, rx, ry):
    if rx <= 0 and ry <= 0:
        return f"M{fmt(x)},{fmt(y)}H{fmt(x + w)}V{fmt(y + h)}H{fmt(x)}Z"
    rx = min(rx or ry, w / 2)
    ry = min(ry or rx, h / 2)
    a = f"A{fmt(rx)},{fmt(ry)} 0 0,1"
    return (f"M{fmt(x + rx)},{fmt(y)}H{fmt(x + w - rx)}{a} {fmt(x + w)},{fmt(y + ry)}"
            f"V{fmt(y + h - ry)}{a} {fmt(x + w - rx)},{fmt(y + h)}"
            f"H{fmt(x + rx)}{a} {fmt(x)},{fmt(y + h - ry)}"
            f"V{fmt(y + ry)}{a} {fmt(x + rx)},{fmt(y)}Z")


def points_d(points, close):
    nums = [num(p) for p in points.replace(",", " ").split()]
    pairs = [f"{fmt(nums[i])},{fmt(nums[i + 1])}" for i in range(0, len(nums) - 1, 2)]
    return "M" + "L".join(pairs) + ("Z" if close else "")


# svg2vectordrawable 2.9.1 은 <circle> 등 기본 도형을 변환하지 않고 버리므로 path 로 바꿔서 넘긴다.
SHAPES = {
    "circle": (("cx", "cy", "r"),
               lambda e: ellipse_d(num(e.get("cx")), num(e.get("cy")), num(e.get("r")), num(e.get("r")))),
    "ellipse": (("cx", "cy", "rx", "ry"),
                lambda e: ellipse_d(num(e.get("cx")), num(e.get("cy")), num(e.get("rx")), num(e.get("ry")))),
    "rect": (("x", "y", "width", "height", "rx", "ry"),
             lambda e: rect_d(num(e.get("x")), num(e.get("y")), num(e.get("width")), num(e.get("height")),
                              num(e.get("rx")), num(e.get("ry")))),
    "line": (("x1", "y1", "x2", "y2"),
             lambda e: f"M{fmt(num(e.get('x1')))},{fmt(num(e.get('y1')))}L{fmt(num(e.get('x2')))},{fmt(num(e.get('y2')))}"),
    "polygon": (("points",), lambda e: points_d(e.get("points", ""), True)),
    "polyline": (("points",), lambda e: points_d(e.get("points", ""), False)),
}


def main(src, dst):
    tree = ET.parse(src)
    root = tree.getroot()
    vx, vy, vw, vh = (num(v) for v in root.get("viewBox", "0 0 24 24").split())

    removed = 0
    for parent in list(root.iter()):
        for child in list(parent):
            if child.tag == f"{{{SVG}}}rect" and covers_viewbox(child, vx, vy, vw, vh):
                parent.remove(child)
                removed += 1

    converted = 0
    for el in root.iter():
        local = el.tag.split("}")[-1]
        if local not in SHAPES or el.get("transform"):
            continue
        geo_attrs, to_d = SHAPES[local]
        d = to_d(el)
        for a in geo_attrs:
            el.attrib.pop(a, None)
        el.tag = f"{{{SVG}}}path"
        el.set("d", d)
        converted += 1

    unsupported = sorted({el.tag.split("}")[-1] for el in root.iter()
                          if el.tag.split("}")[-1] in SHAPES})

    tree.write(dst, encoding="unicode")
    print(f"removed_background_rects={removed} converted_shapes={converted}")
    if unsupported:
        print(f"WARNING: transform 이 있는 기본 도형은 변환하지 못함: {unsupported}")


if __name__ == "__main__":
    if len(sys.argv) != 3:
        sys.exit(__doc__)
    main(sys.argv[1], sys.argv[2])
