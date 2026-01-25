n, t = map(int, input().split())
arr = list(map(int, input().split()))

# Please write your code here.

maxNum = 1
cnt = 1

for i in range(n-1):
    if arr[i] >= t and arr[i] < arr[i+1]:
        cnt += 1
    else:
        cnt = 1
    
    if cnt > maxNum:
        maxNum = cnt
        
print(maxNum)