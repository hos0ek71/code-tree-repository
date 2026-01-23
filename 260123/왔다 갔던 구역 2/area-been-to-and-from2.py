n = int(input())
x = []
dir = []

arr = [0] * 2010

for _ in range(n):
    xi, di = input().split()
    x.append(int(xi))
    dir.append(di)

nextPos = 0
currentPos = 2001

for i in range(n):
    if dir[i] == 'R':
        nextPos = currentPos + x[i]
    else :
        nextPos = currentPos - x[i]
    
    # print(move)
    for i in range(min(currentPos, nextPos),max(currentPos, nextPos)):
        arr[i] += 1

    currentPos= nextPos


cnt = 0
for value in arr:
    if value >= 2:
        cnt += 1
    
print(cnt)
