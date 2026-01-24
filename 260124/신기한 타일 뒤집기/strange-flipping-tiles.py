n = int(input())
commands = [tuple(input().split()) for _ in range(n)]
x = []
dir = []
color = [0] * 1000005

offset = 50000
start = 0
current = offset

for num, direction in commands:
    x.append(int(num))
    dir.append(direction)

    

for i in range(n):
    if dir[i] == 'L':
        next = current - (x[i]-1)
        for j in range(next, current+1):
            color[j] = 1
    else :
        next = current + (x[i]-1)
        for j in range(current, next+1):
            color[j] = 2
    current = next

white = 0 
black = 0

for i in range(len(color)):
    if color[i] == 1:
        # print(i)
        white += 1
    elif color[i] == 2:
        black += 1

print(white, black)
        





# Please write your code here.

