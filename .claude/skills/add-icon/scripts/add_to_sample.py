#!/usr/bin/env python3
"""샘플앱 IconsScreen(Iconography 화면)에 아이콘을 추가한다.

Figma 컴포넌트 이름이 `Etc/` 로 시작하면 --section etcIcons 로 지정한다 (자동 분류보다 우선).

섹션 자동 분류 (drawable xml 기준):
  - 다색이거나, 단색이어도 #000000/#222222 가 아닌 고정색 아이콘 → etcIcons ("Etc")
  - 이름에 _filled 포함                                        → filledIcons ("Filled")
  - 그 외                                                      → outlineIcons ("아이콘")
noStrokeIcons / categoryIcons / myPageIcons 는 자동 분류하지 않으므로 필요하면 --section 으로 지정한다.

각 리스트 끝에 `IconItem("<name>", R.drawable.<name>),` 를 추가하고,
기존 컨벤션대로 11개(그리드 한 줄)마다 빈 줄을 넣는다. 이미 화면에 있는 아이콘은 건너뛴다.

usage: add_to_sample.py <ic_name> [<ic_name> ...] [--section <listName>]
"""
import argparse
import os
import re
import sys

ROOT = os.path.abspath(os.path.join(os.path.dirname(__file__), "../../../.."))
SCREEN = os.path.join(ROOT, "sample/src/main/java/net/deali/designsystem/sample/ui/screen/IconsScreen.kt")
DRAWABLE = os.path.join(ROOT, "designsystem/src/main/res/drawable")
COLUMNS = 11
TINTABLE = {"#000000", "#222222"}
LISTS = ["outlineIcons", "noStrokeIcons", "filledIcons", "categoryIcons", "myPageIcons", "etcIcons"]


def colors_of(name):
    xml = open(os.path.join(DRAWABLE, f"{name}.xml"), encoding="utf-8").read()
    out = set()
    for c in re.findall(r'android:(?:fill|stroke)Color="(#[0-9A-Fa-f]+)"', xml):
        c = c.upper()
        if len(c) == 9:
            if c[1:3] == "00":
                continue
            c = "#" + c[3:]
        out.add(c)
    return out


def classify(name):
    colors = colors_of(name)
    if len(colors) > 1 or (colors and not colors <= TINTABLE):
        return "etcIcons"
    if "_filled" in name:
        return "filledIcons"
    return "outlineIcons"


def list_span(src, list_name):
    m = re.search(rf"^val {list_name} = listOf\(\n", src, re.M)
    if not m:
        sys.exit(f"{list_name} 를 {SCREEN} 에서 찾지 못함")
    end = src.index("\n)\n", m.end())
    return m.end(), end


def insert(src, list_name, name):
    start, end = list_span(src, list_name)
    body = src[start:end]
    count = len(re.findall(r"IconItem\(", body))
    sep = "\n" if count and count % COLUMNS == 0 else ""
    line = f'{sep}    IconItem("{name}", R.drawable.{name}),'
    new_body = body.rstrip("\n") + "\n" + line if body.strip() else line
    return src[:start] + new_body + src[end:]


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("names", nargs="+")
    ap.add_argument("--section", choices=LISTS)
    args = ap.parse_args()

    src = open(SCREEN, encoding="utf-8").read()
    for name in args.names:
        if not os.path.exists(os.path.join(DRAWABLE, f"{name}.xml")):
            sys.exit(f"drawable 없음: {name}")
        if re.search(rf"R\.drawable\.{name}\b", src):
            print(f"skip {name} (이미 화면에 있음)")
            continue
        section = args.section or classify(name)
        src = insert(src, section, name)
        print(f"{name} -> {section}")
    open(SCREEN, "w", encoding="utf-8").write(src)


if __name__ == "__main__":
    main()
