n, m = map(int, input().split())

# Please write your code here.

# 1. n * m 배열크기만큼 0채워나 
# 2. 밑에 기준부터 시작해서 아래 0 오른쪽 1 위쪽 2 왼쪽 3 정의해놔 
# 3. 이중 for문 돌려서 밑에 방향부터 출발해서 cnt를 더해가면서 채워
#     숫자가 0이 아니거나 범위를 벗어난다면 방향을 시계방향으로 돌려

# 4. 채운거 다 출력해

arr = [[0] * m for _ in range(n)]

def isRange(nx,ny):
    return (0 <= nx and nx < n and 0 <= ny and ny < m)


dx = [1,0,-1,0]
dy = [0,1,0,-1]

x = 0
y = 0
dir = 0
cnt = 1
arr[x][y] = 1

for i in range(n):
    for j in range(m):
        if i == 0 and j == 0:
            continue
        nx = x + dx[dir]
        ny = y + dy[dir]
        cnt += 1
        if not isRange(nx, ny) or arr[nx][ny] != 0:
            dir = (dir + 1) % 4

        x = x + dx[dir]
        y = y + dy[dir]

        arr[x][y] = cnt
        
for i in range(n):
    for j in range(m):
        print(arr[i][j], end =" ")
    print()