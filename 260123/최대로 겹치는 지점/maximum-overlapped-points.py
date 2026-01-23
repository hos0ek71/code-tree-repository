n = int(input())
segments = [tuple(map(int, input().split())) for _ in range(n)]

line = [0] * 101
# Please write your code here.

for i in range(n):
    x, y = segments[i]
    for j in range(x,y+1):
        line[j] += 1

maxNum = float('-inf')
for value in line:
    if value > maxNum:
        maxNum = value

print(maxNum)


