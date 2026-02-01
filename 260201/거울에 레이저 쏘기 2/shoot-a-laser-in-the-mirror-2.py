n = int(input())
grid = [list(input()) for _ in range(n)]
k = int(input())

# Please write your code here.

def getDir(dir, d):
    dirR = [3,2,1,0]
    dirL = [1,0,3,2]
    if dir == '\\':
        return dirR[d]
    elif dir == '/':
        return dirL[d]
    return d
    

dx = [-1,0,1,0]
dy = [0,1,0,-1]

k = k-1 

x = 0 
y = 0
d = 0 

if k < n:
    x, y, d = 0,k, 2
elif k < 2*n:
    x, y, d = k-n, n-1, 3
elif k < 3*n:
    x, y, d = n-1, 3*n - 1 - k, 0
else:
    x, y, d = n*4 -k-1, 0, 1

cnt = 0                
cnt = 0

while 0 <= x < n and 0 <= y < n:
    d = getDir(grid[x][y], d)
    x += dx[d]
    y += dy[d]
    cnt += 1

print(cnt)