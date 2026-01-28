N, M = map(int, input().split())

# Process A's movements
v = []
t = []
for _ in range(N):
    vi, ti = map(int, input().split())
    v.append(vi)
    t.append(ti)

# Process B's movements
v2 = []
t2 = []
for _ in range(M):
    vi, ti = map(int, input().split())
    v2.append(vi)
    t2.append(ti)

# Please write your code here.
arrA = [0] * 1000000
totalA = 0
timeA = 0
for i in range(N):
    dis = t[i]
    for j in range(dis):
        totalA += v[i]
        timeA += 1
        arrA[timeA] = totalA

arrB = [0] * 1000000
totalB = 0
timeB = 0
for i in range(M):
    dis = t2[i]
    for j in range(dis):
        totalB += v2[i]
        timeB += 1
        arrB[timeB] = totalB
    
totalTime = timeA
sundu = 3
cnt = 0
for i in range(1, totalTime+1):
    if arrA[i] > arrB[i]:
        now_sundu = 1
        
   
    elif arrB[i] > arrA[i]:
        now_sundu = 2
        
    else:
        now_sundu = 3

    if now_sundu != sundu:
        cnt += 1
        sundu = now_sundu
    
        
print(cnt)