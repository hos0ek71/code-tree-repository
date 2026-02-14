N, S = map(int, input().split())
arr = list(map(int, input().split()))

# Please write your code here.
result = 100000
for i in range(N):
    for j in range(i+1,N):
        sum = 0
        for k in range(N):
            if i == k or j == k:
                continue
            sum += arr[k]
            minNum = (sum - S)
            if minNum >= 0:
                result = min(minNum, result)
            #print(arr[k],sum, end=",")
            #print(result)
        #print()
            
print(result)