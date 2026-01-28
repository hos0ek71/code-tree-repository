N, k, P, T = map(int, input().split())
handshakes = [tuple(map(int, input().split())) for _ in range(T)]

# [체크 1] 입력받은 handshakes는 시간(t)순이라는 보장이 없어요.
# 여기서 정렬(sort)이 한 번 필요합니다.

# [체크 2] 배열 크기 문제: N이 100보다 클 수 있습니다. (N+1) 크기가 안전해요.


# [체크 3] 변수 역할 혼동: P는 처음 감염된 사람의 번호입니다.
# count[P]에 '전염시킬 수 있는 횟수 K'를 넣어줘야 시작되겠죠?


# [체크 4] 결과 저장 배열: 우리는 '시간'이 아니라 '개발자 번호'별 감염 여부가 궁금한 거예요.
# time 대신 infected = [False] * (N + 1) 같은 배열이 필요합니다.
infected = [False] * (N+1)
infected[P] = True
count = [0] * (N+1)

handshakes.sort()

for t,x,y in (handshakes):
 
    # [체크 5] 핵심 로직 오류: 
    # 'k == x'는 '전염 횟수 k'와 '개발자 번호 x'를 비교하는 거라 의미가 맞지 않아요.
    # "만약 x가 감염된 상태이고(True), 남은 전염 횟수(count[x])가 0보다 크다면"으로 바꿔야 합니다.
    x_was_infected = infected[x]
    y_was_infected = infected[y]

    if infected[x] == True and count[x] < k:
        infected[y] = True
        count[x] += 1

    if infected[y] == True and count[y] < k:
        infected[x] = True
        count[y] += 1

# [체크 6] 출력 부분:
# maxTime까지 도는 게 아니라, 개발자 1번부터 N번까지 돌면서
# 감염되었으면 1, 아니면 0을 출력해야 합니다.
for i in range(1, N+1):
    print(int(infected[i]), end = "")