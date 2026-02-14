N, S = map(int, input().split())
arr = list(map(int, input().split()))

# Please write your code here.

def compare(a,b):
    if a >= b:
        return a-b
    else:
        return b-a

result = 10000
for i in range(N):
    for j in range(i+1,N):
        sum = 0
        for k in range(N):
            if i == k or j == k:
                continue
            sum += arr[k]

       
        minNum = compare(sum,S)
        if minNum >= 0:
            result = min(minNum, result)
        # print(minNum)
            
print(result)