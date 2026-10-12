---
name: add-icon
description: 디자인팀 요청으로 Figma 아이콘을 디자인시스템 drawable(ic_*.xml)로 추가하고, Jira 티켓 생성(DesignSystem 에픽) → dev 커밋 → 버전업 → release 배포까지 진행한다. "아이콘 추가" 요청이나 Figma 아이콘 링크가 주어질 때 사용.
argument-hint: <figma-url> [ic_name] [<figma-url> [ic_name] ...] [MP-XXXX]
---

# 디자인시스템 아이콘 추가

기존 수동 프로세스(Figma 벡터 다운로드 → drawable 추가 → dev 커밋 → 버전업 → release push)를 그대로 따른다.
참고 커밋: `0998797`, `2d73535`, `e4c1ec9` (아이콘 추가), `9f79242` (버전업).

## 진행 원칙

Figma 링크를 받으면 **중간 확인 없이** 끝까지 진행한다:
drawable 추가 → Jira 티켓 생성 → 아이콘 커밋 → 패치 버전업 커밋.
push(7단계)만 사용자 승인 후 진행한다.

중간에 멈추고 묻는 경우는 아래뿐이다:
- 노드가 아이콘 프레임이 아님(화면/페이지 전체), 비트맵 포함
- 같은 이름의 drawable 이 이미 있음 (교체 여부)
- 같은 아이콘으로 열린 Jira 티켓이 이미 있음
- 변환 결과 path 수가 Figma 레이어 수와 다름, 빌드 검증 실패
- 작업 트리에 관련 없는 변경이 있어 커밋 범위가 애매함

MULTICOLOR/SIZE 경고는 멈추지 않고 마무리 보고에 포함한다.

## 입력

- Figma 링크 1개 이상. 각 링크의 `node-id`는 **아이콘 프레임(24x24 컴포넌트)** 이어야 한다.
- 아이콘 이름 — 생략 시 Figma 레이어/컴포넌트 이름에서 만든다 (`get_metadata`로 확인).
- Jira 키 `MP-XXXX` — 선택. 주어지면 그 티켓을 쓰고, 없으면 2단계 뒤에 **자동 생성**한다 (아래 "Jira 티켓").

## Jira 티켓 (키가 주어지지 않은 경우)

아이콘 추가용 티켓은 미리 만들지 않는다. 아이콘 이름이 확정된 뒤(2단계 이후, 커밋 전)에 DesignSystem 에픽 하위로 생성한다.
기존 아이콘 티켓(MP-6879) 형식을 따른다.

- cloudId: `dealicious.atlassian.net`
- 담당자: `mcp__atlassian__atlassianUserInfo` 로 조회한 현재 사용자 accountId
- `mcp__atlassian__createJiraIssue`:
  - `projectKey`: `MP`
  - `issueTypeName`: `Task`
  - `parent`: `MP-3486` (에픽 "DesignSystem")
  - `summary`: `[안드로이드] ic_aaa, ic_bbb 아이콘 추가` (교체면 `아이콘 교체`)
  - `description` (markdown): Figma 링크 목록, 추가 아이콘 이름, 경고(MULTICOLOR/SIZE) 요약
  - `assignee_account_id`: 위 accountId
- 생성 전에 같은 아이콘 이름으로 이미 열린 티켓이 있는지 확인한다:
  `project = MP AND parent = MP-3486 AND summary ~ "ic_aaa" AND statusCategory != Done`
  결과 중 summary 가 `[안드로이드]` 로 시작하는 티켓이 있으면 새로 만들지 않고 사용자에게 그 티켓을 쓸지 묻는다.
  `[아이폰]` 등 다른 플랫폼 티켓은 중복이 아니다 — 새로 만들고 description 에 해당 티켓 키를 참고로 적는다.
- 생성된 키를 이후 커밋 메시지에 사용하고, 마무리 보고에 티켓 링크를 포함한다.

## 1. 사전 확인

```bash
git status --porcelain            # 관련 없는 변경이 있으면 멈춤 (커밋은 항상 대상 파일만 지정)
git fetch origin && git checkout dev && git pull --ff-only origin dev
git rev-parse origin/dev origin/release   # 보통 동일. 다르면 사용자에게 알리고 진행 여부 확인
```

이름 규칙 (위반 시 멈추고 확인):
- `^ic_[a-z0-9]+(_[a-z0-9]+)*$`, 채움형은 `_filled` 접미사 (예: `ic_lock` / `ic_lock_filled`)
- `designsystem/src/main/res/drawable/<name>.xml` 이 이미 있으면 **교체인지 신규인지 반드시 확인**

## 2. Figma에서 SVG 받기

링크에서 `fileKey`, `nodeId`(`-` → `:`)를 추출한다. branch URL이면 branchKey가 fileKey.

1. `mcp__claude_ai_Figma__get_metadata(fileKey, nodeId)` — 노드가 아이콘 프레임인지, 크기(보통 24x24)와 이름 확인. 화면/페이지 전체 노드면 멈추고 정확한 아이콘 노드를 요청한다.
2. `mcp__claude_ai_Figma__download_assets(fileKey, nodeId, defaultFormat: "svg")` — 응답의 `export` URL(프레임 전체 SVG, viewBox 유지)을 사용한다. `svgAssets`는 내부 레이어만 잘린 것이라 사용하지 않는다.
3. URL은 임시이므로 즉시 받는다. 스크래치패드의 새 디렉터리에 저장:
   ```bash
   W=<scratchpad>/add-icon-$(date +%s); mkdir -p $W/svg $W/raw $W/out
   curl -fsSL "<export url>" -o $W/svg/<name>.svg   # 샌드박스면 URL 호스트를 allowed_domains에 추가
   ```
   받은 SVG에 `<image>`/base64 비트맵이 있으면 중단하고 디자이너에게 벡터 아웃라인 요청.

## 3. 변환 + 정규화

```bash
mkdir -p $W/conv $W/clean && (cd $W/conv && npm_config_cache=$TMPDIR/npmcache npm i --silent svg2vectordrawable@2.9.1)
python3 -I .claude/skills/add-icon/scripts/clean_figma_svg.py $W/svg/<name>.svg $W/clean/<name>.svg
# 출력 파일명에 '.' 이 두 개 이상이면 s2v가 '_'로 바꾸므로 이름 그대로 사용
(cd $W/conv && npx s2v -p 3 -i $W/clean/<name>.svg -o $W/raw/<name>.xml)
python3 -I .claude/skills/add-icon/scripts/normalize_vd.py $W/raw/<name>.xml $W/out/<name>.xml
```

`clean_figma_svg.py` 는 반드시 거쳐야 한다:
- Figma export 에는 프레임 배경(#161616), 상위 카드 rect, 컴포넌트 흰 배경 rect 가 섞여 온다 → viewBox 전체를 덮는 rect 제거
- svg2vectordrawable 2.9.1 은 `<circle>` 등 기본 도형을 **경고 없이 버린다** → path 로 변환
- 변환 후 `get_metadata` 의 자식 레이어 수와 결과 XML 의 `<path>` 수가 맞는지 확인한다 (불일치 시 누락 의심)

정규화 스크립트가 하는 일: 빈 `<group>`/전체 clip-path 제거, 단색이면 `#000000`으로 통일(사용처에서 tint), Android Studio 형식으로 출력.
마지막 줄 JSON의 `warnings`를 확인한다:
- `MULTICOLOR` — 체크박스류처럼 다색 아이콘일 수 있다. 그대로 진행하고 보고에 포함.
- `SIZE` — 24dp가 아님. Figma 프레임 크기 그대로 진행하고 보고에 포함.

결과를 `designsystem/src/main/res/drawable/<name>.xml` 로 복사한다. **Copyright 주석은 넣지 않는다.**

## 3-1. 샘플앱 Iconography 화면에 추가

`sample/src/main/java/net/deali/designsystem/sample/ui/screen/IconsScreen.kt` 의 아이콘 리스트에 추가한다.
```bash
python3 -I .claude/skills/add-icon/scripts/add_to_sample.py <name> [<name> ...]
```
**Figma 컴포넌트 이름이 우선이다.** 2단계 `get_metadata` 의 symbol name 이 `Etc/ic_xxx` 처럼 `Etc/` 로 시작하면
`--section etcIcons` 로 지정한다. Etc 섹션은 아이콘마다 고유 사이즈/컬러가 있어 샘플 화면에서 tint·사이즈 변경 없이 원본 그대로 노출된다.

`Etc/` 가 아니면 drawable 기준으로 자동 분류된다:
- 다색이거나 #000000/#222222 가 아닌 고정색 → `etcIcons` (Etc)
- 이름에 `_filled` → `filledIcons` (Filled)
- 그 외 → `outlineIcons` (아이콘)

`noStrokeIcons`/`categoryIcons`/`myPageIcons` 는 자동 분류하지 않는다. 짝이 되는 기존 아이콘이 그 섹션에 있으면
(예: `ic_x_s` → `ic_x_ss`) `--section noStrokeIcons` 처럼 지정한다.
섹션 높이는 아이콘 수로 자동 계산되므로 따로 손대지 않는다.

## 4. 검증

```bash
./gradlew :designsystem:verifyReleaseResources :sample:compileDebugKotlin -q \
  -Djava.io.tmpdir=$TMPDIR -Pkotlin.compiler.execution.strategy=in-process
```
(샌드박스에서는 Kotlin 데몬이 시스템 temp 에 못 써서 위 옵션이 필요하다. `FSEvents` 경고는 무시.)

변환한 XML의 핵심(사이즈, 색상, path 수)과 샘플 화면 섹션은 마무리 보고에 포함한다. 여기서 멈추지 않는다.

## 5. 커밋 (dev)

추가한 drawable 과 IconsScreen.kt 만 커밋한다 (다른 staged 파일이 섞이지 않도록 pathspec 지정).
```bash
SCREEN=sample/src/main/java/net/deali/designsystem/sample/ui/screen/IconsScreen.kt
git add designsystem/src/main/res/drawable/<name>.xml ... $SCREEN
git commit -m "[MP-XXXX] ic_aaa, ic_bbb 아이콘 추가" -- designsystem/src/main/res/drawable/<name>.xml ... $SCREEN
```
교체인 경우 메시지는 `[MP-XXXX] ic_aaa 아이콘 교체`.

## 6. 버전업 커밋

버전은 `.github/workflows/release.yml` 의 `VERSION_NAME` 한 곳에만 있다. patch 를 +1 (minor/major 요청이 있으면 그에 따름).
```bash
F=.github/workflows/release.yml
CUR=$(sed -nE 's/^ +VERSION_NAME: ([0-9]+\.[0-9]+\.[0-9]+)$/\1/p' $F)
NEW=$(echo $CUR | awk -F. '{print $1"."$2"."$3+1}')
sed -i '' -E "s/^( +VERSION_NAME: )$CUR$/\1$NEW/" $F
git diff $F   # 한 줄만 바뀌었는지 확인
git add $F && git commit -m "버전업 $NEW" -- $F
```
커밋 메시지는 반드시 `버전업 ` 으로 시작해야 한다 (워크플로 키워드).

## 7. 배포 — 반드시 사용자 확인 후

push 전 `git log --oneline origin/dev..dev` 와 새 버전을 보여주고 **명시적으로 승인받는다**. 승인 후:
```bash
git push origin dev
git push origin dev:release    # release 는 dev 와 같은 선형 히스토리 (fast-forward)
```
`dev:release` 가 non-fast-forward 로 거부되면 강제 push 하지 말고 멈춰서 사용자에게 알린다.

release push 후 GitHub Actions 가 태그/Release 를 생성하고 JitPack 빌드, Slack `#안드로이드빌드` 로 결과가 온다.
가능하면 `gh run list --branch release -L 1` 로 워크플로 결과를 확인해서 보고한다.

## 마무리 보고

- Jira 티켓 링크 (`https://dealicious.atlassian.net/browse/MP-XXXX`)
- 추가된 아이콘 목록과 경고
- 커밋 2개 해시, 새 버전
- 사용처 안내: `painterResource(R.drawable.<name>)` / JitPack `<새 버전>`
