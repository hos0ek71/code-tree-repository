n, m = map(int, input().split())

# Process robot A's movements
t1 = []
d1= []
for _ in range(n):
    time, direction = input().split()
    t1.append(int(time))
    d1.append(direction)

# Process robot B's movements
t2= []
d2 = []
for _ in range(m):
    time, direction = input().split()
    t2.append(int(time))
    d2.append(direction)

# Please write your code here.
timeA = 0
OFFSET = 50001
arrA = [0] * 1000000
cur = 0  
for i in range(n):

    dis = t1[i]
    if d1[i] == 'R':
        for j in range(dis):
            timeA += 1
            cur += 1
            arrA[timeA] = cur
    else:
        for j in range(dis):
            timeA += 1
            cur -= 1
            arrA[timeA] = cur

arrB = [0] * 1000000
timeB = 0
cur = 0
for i in range(m):

    dis = t2[i]
    if d2[i] == 'R':
        for j in range(dis):
            timeB += 1
            cur += 1
            arrB[timeB] = cur
    else:
        for j in range(dis):
            timeB += 1
            cur -= 1
            arrB[timeB] = cur


# 실제로 둘 중 더 오래 움직인 시간까지만 비교하면 됩니다.
max_time = max(timeA, timeB)

# [Padding] A가 먼저 멈췄다면, A의 마지막 위치(arrA[time_a])로 max_time까지 채워줌
for i in range(timeA + 1, max_time + 1):
    arrA[i] = arrA[timeA]

# [Padding] B가 먼저 멈췄다면, B의 마지막 위치(arrB[time_b])로 max_time까지 채워줌
for i in range(timeB + 1, timeB + 1):
    arrB[i] = arrB[timeB]

# [비교] 1초부터 max_time까지만 돌리면 됩니다. (100만까지 돌릴 필요 X)
cnt = 0
for i in range(1, max_time + 1):
    if arrA[i] == arrB[i] and arrA[i-1] != arrB[i-1]:
        cnt += 1

print(cnt)




    

# 초에 맞게 배열에 저장하고
# 그 초에 배열에 똑같은 방향이 왔다하면
# 만약에 직전에 같은 위치에 않았다면 arrA[i-1] !=  arrB[i-1]
# 0초에는 증가하지않고 그이후 시간에 만남카운트증가
# 끝까지 다하고 난후에는 만남카운트 증가하면안됨 if i == max continue;



