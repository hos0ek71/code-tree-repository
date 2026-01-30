N = int(input())
moves = [tuple(input().split()) for _ in range(N)]

def getDir(dir):
    if dir == 'E':
        return 0
    elif dir == 'S':
        return 1
    elif dir == 'W':
        return 2
    else:
        return 3

dx = [0,1,0,-1]
dy = [1,0,-1,0]

x = 0
y = 0
time = 0
direction = getDir(dir)


def moveCount(moves, x, y):
    global time
    
    for dir, num in (moves):
        direction = getDir(dir)
        dist = int(num) 

        for i in range(dist):
            x = x + dx[direction]
            y = y + dy[direction]
            time += 1

            if x == 0 and y == 0:
                return time
    return -1
    
        
       
     

         

print(moveCount(moves, x, y))
