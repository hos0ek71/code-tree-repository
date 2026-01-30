commands = input()

# Please write your code here.

x = 0 
y = 0

dx = [-1, 0,1,0]
dy = [0,1,0,-1]


def getDir(direction, dir ):
    
    if direction == 'R':
        dir = (dir + 1) % 4
    else:
        dir = ((dir +1) + 2 ) % 4 

    return dir    

prevdir = 0
cnt = 0
result = False
for i in range(len(commands)):
    dir = commands[i]
    
    
    if dir == 'F':
        x = x + dx[prevdir]
        y = y + dy[prevdir]
        cnt += 1
    else:
        curdir = getDir(dir, prevdir)
        prevdir = curdir
        cnt += 1

    if x == 0 and y == 0:
        result = True
        break

if result :
    print(cnt)
else:
    print(-1)

