x1, y1, x2, y2 = [0] * 2, [0] * 2, [0] * 2, [0] * 2
x1[0], y1[0], x2[0], y2[0] = map(int, input().split())
x1[1], y1[1], x2[1], y2[1] = map(int, input().split())
# Please write your code here.

OFFSET = 1000
arr = [[0] * 2001 for _ in range(2001)]


for i in range(2):
    ax1 = x1[i]
    ax2 = x2[i]
    ay1 = y1[i]
    ay2 = y2[i]

    for j in range(ax1, ax2):
        for k in range(ay1, ay2):
            arr[j+OFFSET][k+OFFSET] = i + 1

maxX = -2001
minX = 2001
maxY = -2001
minY = 2001


found = False
for i in range(2001):
    for j in range(2001):
        if arr[i][j] == 1:
            found = True
            if maxX < i: maxX = i
            if minX > i: minX = i
            if maxY < j: maxY = j
            if minY > j: minY = j
                
if not found:
    print(0)
else:
    print( (maxX - minX+1)  * (maxY - minY+1))

