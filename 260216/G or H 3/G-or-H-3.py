n, k = map(int, input().split())
x = []
c = []
for _ in range(n):
    pos, char = input().split()
    x.append(int(pos))
    c.append(char)

# Please write your code here.

position = 0 

for i in range(len(x)):
    position = max(x[i], position)

idx = [0] * (position+2)

for pos,alpa in zip(x,c):
    if alpa == 'G':
        idx[pos] = 1

    elif alpa == 'H':
        idx[pos] = 2

    else:
        idx[pos] = 0
    
    
maxNum = 0 
for i in range(1,position-k+2):
    sum = 0 
    for j in range(i,i+k+1):
        sum += idx[j]
        maxNum = max(maxNum, sum)
        print(i,j)

print(maxNum)