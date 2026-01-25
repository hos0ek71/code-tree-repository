n = int(input())
x1, y1, x2, y2 = [], [], [], []
for _ in range(n):
    a, b, c, d = map(int, input().split())
    x1.append(a)
    y1.append(b)
    x2.append(c)
    y2.append(d)

arr = [[0] * 205 for _ in range(205)]
OFFSET = 100

for i in range(n):
    ax1 = x1[i]
    ax2 = x2[i]
    ay1 = y1[i]
    ay2 = y2[i]

    if i % 2 == 0:
        color = 1
    else:
        color = 2

    for j in range(ax1, ax2):
        for k in range(ay1, ay2):
            arr[j+OFFSET][k+OFFSET] = color

blue = 0
for row in range(205):
    for column in range(205):
        if arr[row][column] == 2:
            blue += 1

print(blue)