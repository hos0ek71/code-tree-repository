n, m = map(int, input().split())
points = [tuple(map(int, input().split())) for _ in range(m)]

# Please write your code here.

arr = [[0] * (m+1) for _ in range(n+1)]


dx = [0,1,0,-1]
dy = [1,0,-1,0]

def isRange(nx, ny, n, m):
    if 1 <= nx  and nx <= n and 1 <= ny and ny <= m:
        return True
    else:
        return False

for row, column in points:
    arr[row][column] = 1
    cnt = 0
    for i in range(4):
        nx = row + dx[i]
        ny = column + dy[i]

        if isRange(nx,ny,n,m) and arr[nx][ny] == 1:
            cnt += 1

    if cnt == 3:
        print(1)
    else:
        print(0)

    
