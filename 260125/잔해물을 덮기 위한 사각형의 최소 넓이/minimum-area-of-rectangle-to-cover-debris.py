x1, y1, x2, y2 = [0] * 2, [0] * 2, [0] * 2, [0] * 2
x1[0], y1[0], x2[0], y2[0] = map(int, input().split())
x1[1], y1[1], x2[1], y2[1] = map(int, input().split())
# Please write your code here.

OFFSET = 1000
arr = [[0] * 2001 for _ in range(2001)]


for i in range(1,3):
    ax1 = x1[i]
    ax2 = x2[i]
    ay1 = y1[i]
    ay2 = y2[i]

    for j in range(ax1, ax2+1):
        for k in range(ay1, ay2+1):
            arr[j+OFFSET][k+OFFSET] == i

maxNum = -1000

for i in range(2001):
    if arr[i][j] == 1 and i > maxNum:
        maxNum = i
    for j in range(2001):
        if arr[i][j] == 1 and j > maxNum:
            maxNum = j

for i in range(2001):
    if arr[i][j] == 1 and i > maxNum:
        maxNum = i
    for j in range(2001):
        if arr[i][j] == 1 and j > maxNum:
            maxNum = j
