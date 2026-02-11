n = int(input())
points = [tuple(map(int, input().split())) for _ in range(n)]
x = [p[0] for p in points]
y = [p[1] for p in points]


def distance(x, y, x2, y2) :
    return abs((x - x2) + (y - y2))

jump = 1

for i in range(n):
    for j in range(i,n):

        if j == jump:
            jump += 1
            continue


