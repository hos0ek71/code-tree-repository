n = int(input())
points = [tuple(map(int, input().split())) for _ in range(n)]
x = [p[0] for p in points]
y = [p[1] for p in points]

# Please write your code here.
minNum = 10000
for i in range(n):
    for j in range(n):
        for k in range(n):
            if i == j or j == k or i == k:
                continue
            x1,y1 = points[j] 
            x2,y2 = points[k]

            ans = ((x1 - x2)**2) + ((y1 - y2)**2)
            minNum = min(minNum , ans)

print(minNum)

# 00 33 11 

# 0 
# 1 2,
# 1
# 0 1