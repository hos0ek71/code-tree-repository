n, m = map(int, input().split())

# Please write your code here.
# 65 <=  <= 90 

def isRange(nx, ny):
    return (0 <= nx and nx < n and 0 <= ny and ny < m )

arr = [[0] * m for _ in range(n)]

dx = [0,1,0,-1]
dy = [1,0,-1,0]

x = 0
y = 0
dir = 0
arr[x][y] = 65
cnt = 65

for num in range(2, n*m+1):
    nx = x + dx[dir]
    ny = y + dy[dir]
    cnt += 1
    if not isRange(nx,ny) or arr[nx][ny] != 0:
        dir = (dir + 1) % 4
    
    x = x + dx[dir]
    y = y + dy[dir]

    if cnt > 90:
        cnt = 64

    arr[x][y] = cnt

for row in arr:
    for value in row:
        print(chr(value), end=" ") # 숫자 하나씩 꺼내서 문자로 변환
    print() # 한 행이 끝나면 줄바꿈