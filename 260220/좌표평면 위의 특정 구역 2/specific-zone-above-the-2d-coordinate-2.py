n = int(input())
points = [tuple(map(int, input().split())) for _ in range(n)]
x = [p[0] for p in points]
y = [p[1] for p in points]

# Please write your code here.
rect = 160000

for i in range(n):

    maxW  = 0
    minW = 400001
    maxH = 0
    minH = 400001

    for j in range(n):

        if i == j:
            continue
        
        maxW = max(maxW, x[j])
        minW = min(minW, x[j])
        maxH = max(maxH, y[j])
        minH = min(minH, y[j])
        
        width = (maxW-minW) * (maxH-minH)
        # print(f"x:{maxW},x:{minW},y:{maxH},y;{minH}, width : {width}")

    if (maxW-minW) * (maxH-minH) > 0 and rect > (maxW-minW) * (maxH-minH):
            rect = (maxW-minW) * (maxH-minH)
            
        # print(rect)

print(rect)

