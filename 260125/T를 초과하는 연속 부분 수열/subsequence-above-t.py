n, t = map(int, input().split())
arr = list(map(int, input().split()))

# Please write your code here.

maxNum = 0
cnt = 0

for i in range(n):
    if arr[i] > t:
        cnt += 1
        # print(arr[i])
    else:
        cnt = 0
    
    if cnt > maxNum:
        maxNum = cnt
        
print(maxNum)
