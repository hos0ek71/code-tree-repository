import sys

n = int(input())
points = [tuple(map(int, input().split())) for _ in range(n)]

# zip과 *를 이용한 언패킹 (잘 사용하셨습니다!)
x, y = zip(*points)
x, y = list(x), list(y)

# 1. 2차원 배열 선언 (201x201 크기)
OFFSET = 100
arr = [[0] * 201 for _ in range(201)]

# 

# 2. 사각형 칠하기
for i in range(n): # 0부터 n-1까지 반복
    # 좌표에 OFFSET을 더해 음수 방지
    ax = x[i] + OFFSET
    ay = y[i] + OFFSET
    
    # 사각형 크기가 8x8이므로 8칸씩 반복
    for j in range(ax, ax + 8):
        for k in range(ay, ay + 8):
            # 3. 할당 연산자(=) 사용
            arr[j][k] = 1

# 4. 칠해진 칸 개수 세기
cnt = 0
for i in range(201):
    for j in range(201):
        if arr[i][j] == 1:
            cnt += 1

print(cnt)