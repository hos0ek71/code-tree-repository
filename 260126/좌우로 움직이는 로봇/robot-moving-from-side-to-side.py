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
time = 0
OFFSET = 50001
arrA = [0] * 1000000
cur = 0  
for i in range(n):

    dis = t1[i]
    if d1[i] == 'R':
        for j in range(dis):
            time += 1
            cur += 1
            arrA[time] = cur
    else:
        for j in range(dis):
            time += 1
            cur -= 1
            arrA[time] = cur

arrB = [0] * 1000000
time = 0
cur = 0
for i in range(m):

    dis = t2[i]
    if d2[i] == 'R':
        for j in range(dis):
            time += 1
            cur += 1
            arrB[time] = cur
    else:
        for j in range(dis):
            time += 1
            cur -= 1
            arrB[time] = cur

time_a = len(arrA) - 1
time_b = len(arrB) - 1
    
    # 전체 시뮬레이션 시간은 둘 중 더 늦게 끝난 로봇 기준
max_time = max(time_a, time_b)
    # A가 먼저 멈췄다면, 남은 시간 동안 마지막 위치(cur_a)로 채우기
for _ in range(time_a, max_time):
    arrA.append(arrA[time_a])

# B가 먼저 멈췄다면, 남은 시간 동안 마지막 위치(cur_b)로 채우기
for _ in range(time_b, max_time):
    arrB.append(arrB[time_b])

cnt = 0
for i in range(1, 1000000):
    if arrA[i] == arrB[i] and arrA[i-1] !=  arrB[i-1]:
        cnt += 1
print(cnt)



    

# 초에 맞게 배열에 저장하고
# 그 초에 배열에 똑같은 방향이 왔다하면
# 만약에 직전에 같은 위치에 않았다면 arrA[i-1] !=  arrB[i-1]
# 0초에는 증가하지않고 그이후 시간에 만남카운트증가
# 끝까지 다하고 난후에는 만남카운트 증가하면안됨 if i == max continue;



