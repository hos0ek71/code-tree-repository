N, M = map(int, input().split())
arr = [input() for _ in range(N)]

# Please write your code here.

directions = [(0,1),(1,0),(-1,1),(1,1)]

cnt = 0 
def isRange(x, y):
    return 0 <= x and x < N and 0 <= y and y < M

for i in range(N):
    for j in range(M):
        
        
        for k in range(4):
            dx, dy = directions[k]
            name = "" 

            for step in range(3):

                nx = i + (dx * step)
                ny = j + (dy * step)

                if not isRange(nx, ny):
                    break;
                name += arr[nx][ny]

            if name == 'LEE' or name == 'EEL':
                cnt += 1
                
print(cnt)

       

