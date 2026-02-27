n = int(input())
points = [tuple(map(int, input().split())) for _ in range(n)]
x = [p[0] for p in points]
y = [p[1] for p in points]

# Please write your code here.

# 00 10
# 10 12 

# 00 02
# 00 10

# -10 00
# -10 -50

# 00 20
# -10 00

# 두 쌍의 x 가 서로 같거나 혹은 y가 서로 같으면 직각삼각형?
ans = 0 
for i in range(n):
    for j in range(i+1, n):
        for k in range(j+1, n):
            if (x[i] == x[j] or x[i] == x[k] or x[j] == x[k]) and (y[i] == y[j] or y[i] == y[k] or y[j] == y[k]):
                bot = max(x[i], x[j], x[k]) - min(x[i], x[j], x[k])
                height = max(y[i], y[j], y[k]) - min(y[i], y[j], y[k])
                ans = max(ans,bot * height)
                
print(ans)

