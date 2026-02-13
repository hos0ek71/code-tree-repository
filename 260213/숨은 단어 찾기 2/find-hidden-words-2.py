N, M = map(int, input().split())
arr = [input() for _ in range(N)]

# Please write your code here.

directions = [(0,1),(1,0),(-1,1),(1,1)]

def isRange(x, y):
    return 0 <= x and x < N and 0 <= y and y < M

for i in range(N-2):
    for j in range(M-2):
        
        
        for k in range(4):
            dx, dy = directions[k]

            for step in range(3):

                nx = j + (dx * step)
                ny = j + (dy * step)

                if not isRange(nx, ny):
                    break;
                print(arr[nx][ny], end="")

            print()

            
            

