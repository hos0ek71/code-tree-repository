n, m = map(int, input().split())

# Process A's movements
v = []
t = []
for _ in range(n):
    vi, ti = map(int, input().split())
    v.append(vi)
    t.append(ti)

# Process B's movements
v2 = []
t2 = []
for _ in range(m):
    vi, ti = map(int, input().split())
    v2.append(vi)
    t2.append(ti)

# Please write your code here.
arrA = [0] * 1000000 
arrB = [0] * 1000000

timeA = 0
spdSum = 0 
for i in range(n):
    disA = t[i]
    spd = v[i]
    for j in range(disA):
        timeA += 1
        spdSum += spd 
        arrA[timeA] = spdSum

timeB = 0
spdSum = 0         
for i in range(m):
    disB = t2[i]
    spd = v2[i]
    for j in range(disB):
        timeB += 1
        spdSum += spd 
        arrB[timeB] = spdSum

maxTime = max(timeA, timeB)
sundu = 0
cnt = 0

for i in range(1, maxTime):
    if arrA[i] > arrB[i]:
        if sundu == 2:
            cnt += 1
        sundu = 1

    elif arrA[i] < arrB[i]:
        if sundu == 1:
            cnt += 1
        sundu = 2

print(cnt)


    # print(f"A : {arrA[i]} ,B : {arrB[i]}" )
    

    

    
    


