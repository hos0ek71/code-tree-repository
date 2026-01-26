import sys

# 입력 속도를 위해 sys.stdin.readline 사용 권장
input = sys.stdin.read().split()
ptr = 0

n, m = int(input[ptr]), int(input[ptr+1])
ptr += 2

# Process robot A's movements
t1 = []
d1 = []
for _ in range(n):
    time_val = int(input[ptr])
    direction = input[ptr+1]
    t1.append(time_val)
    d1.append(direction)
    ptr += 2

# Process robot B's movements
t2 = []
d2 = []
for _ in range(m):
    time_val = int(input[ptr])
    direction = input[ptr+1]
    t2.append(time_val)
    d2.append(direction)
    ptr += 2

# --- 시뮬레이션 시작 ---
# 인덱스 에러 방지를 위해 1,000,001로 설정
arrA = [0] * 1000001
arrB = [0] * 1000001

# 로봇 A 기록
timeA = 0
cur = 0  
for i in range(n):
    dis = t1[i]
    if d1[i] == 'R':
        for j in range(dis):
            timeA += 1
            cur += 1
            arrA[timeA] = cur
    else:
        for j in range(dis):
            timeA += 1
            cur -= 1
            arrA[timeA] = cur

# 로봇 B 기록
timeB = 0
cur = 0
for i in range(m):
    dis = t2[i]
    if d2[i] == 'R':
        for j in range(dis):
            timeB += 1
            cur += 1
            arrB[timeB] = cur
    else:
        for j in range(dis):
            timeB += 1
            cur -= 1
            arrB[timeB] = cur

# 전체 시뮬레이션 시간 계산
max_time = max(timeA, timeB)

# [Padding] A가 먼저 멈췄다면, A의 마지막 위치로 max_time까지 채워줌
for i in range(timeA + 1, max_time + 1):
    arrA[i] = arrA[timeA]

# [Padding] B가 먼저 멈췄다면, B의 마지막 위치로 max_time까지 채워줌 (범위 수정됨)
for i in range(timeB + 1, max_time + 1):
    arrB[i] = arrB[timeB]

# [비교] 1초부터 max_time까지만 판정
cnt = 0
for i in range(1, max_time + 1):
    # 조건: 현재는 위치가 같고(==), 바로 직전(i-1)에는 위치가 달랐어야 함
    if arrA[i] == arrB[i] and arrA[i-1] != arrB[i-1]:
        cnt += 1

print(cnt)