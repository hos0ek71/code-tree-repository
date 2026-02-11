n = int(input())
points = [tuple(map(int, input().split())) for _ in range(n)]
x = [p[0] for p in points]
y = [p[1] for p in points]


# for _ in (points):
#     print(_)
# def distance(x, y, x2, y2) :
#     return abs((x - x2) + (y - y2))

# jump = 1

# for i in range(n):
#     for j in range(n):
#          dis += abs(x[i] - x[i+1]) + (y[j] - y[j+1)
#         if i == jump:
#             jump += 1
#             continue

dis = 0
for i in range(n-1):
        dis += (abs(x[i]- x[i+1]) + abs(y[i] - y[i+1]))
        

max_benefit = 0

for i in range(1, n - 1):
    # i번을 거쳐갈 때의 거리 (원래 거리)
    before = (abs(x[i-1] - x[i]) + abs(y[i-1] - y[i])) + (abs(x[i] - x[i+1]) + abs(y[i] - y[i+1]))
    
    # i번을 안 거치고 바로 갈 때의 거리 (지름길)
    after = abs(x[i-1] - x[i+1]) + abs(y[i-1] - y[i+1])
    
    # 건너뛰었을 때 얼마나 이득(감소량)을 보는지 계산
    benefit = before - after
    
    # 그 중 가장 큰 이득을 기억해둠
    if benefit > max_benefit:
        max_benefit = benefit
        
print(dis - max_benefit)