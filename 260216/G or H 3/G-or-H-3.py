n, k = map(int, input().split())
x = []
c = []
for _ in range(n):
    pos, char = input().split()
    x.append(int(pos))
    c.append(char)

# Please write your code here.

idx = [0] * (10001)

for pos,alpa in zip(x,c):
    if alpa == 'G':
        idx[pos] = 1

    elif alpa == 'H':
        idx[pos] = 2

    else:
        idx[pos] = 0
    
    
maxNum = 0 
for i in range(10000-k+1):
    sum = 0 
    for j in range(i, i + k + 1):
        sum += idx[j]

    maxNum = max(maxNum, sum)
        
    
print(maxNum)