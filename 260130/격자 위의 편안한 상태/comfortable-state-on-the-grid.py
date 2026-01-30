n, m = map(int, input().split())
points = [tuple(map(int, input().split())) for _ in range(m)]

# 1~n 좌표를 쓰기 위해 n+1 크기
arr = [[0] * (n+1) for _ in range(n+1)]

dx = [0, 1, 0, -1]
dy = [1, 0, -1, 0]

def isRange(x, y):
    return 1 <= x <= n and 1 <= y <= n

for row, col in points:
    # 색칠
    arr[row][col] = 1
    
    cnt = 0
    
    # 상하좌우 4방향 검사
    for i in range(4):
        nx = row + dx[i]
        ny = col + dy[i]
        
        if isRange(nx, ny) and arr[nx][ny] == 1:
            cnt += 1
    
    # 정확히 3개면 편안한 상태
    if cnt == 3:
        print(1)
    else:
        print(0)