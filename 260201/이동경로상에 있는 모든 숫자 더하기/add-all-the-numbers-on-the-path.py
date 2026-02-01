N, T = map(int, input().split())
str = input()
board = [list(map(int, input().split())) for _ in range(N)]

# Please write your code here.
def isRange(nx, ny):
    return (0<= nx and nx < N and 0 <= ny and ny < N)


dx = [-1,0,1,0]
dy = [0,1,0,-1]

x = (N // 2)
y = (N // 2)
dir = 0 
sum = board[x][y]

for i in range(len(str)):
    if str[i] == 'R':
        dir = (dir + 1) % 4
    elif str[i] == 'L':
        dir = ((dir - 1) + 4) % 4
    else:
        nx = x + dx[dir]
        ny = y + dy[dir]
        if isRange(nx, ny):
            x = nx
            y = ny 
            sum += board[x][y] 
                    
print(sum)
