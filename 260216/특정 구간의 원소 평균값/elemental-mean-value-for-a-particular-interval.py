n = int(input())
arr = list(map(int, input().split()))

# Please write your code here.

cnt = 0 
for i in range(n):
    sum = 0 
    for j in range(i, n):

        sum += arr[j]

        for k in range(i, j+1):
            if sum == arr[k]:
                cnt += 1

print(cn)