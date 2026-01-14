n = int(input())
arr = list(map(int, input().split()))

# Please write your code here.

result = []

for i in range(n):
    result.append(arr[i])
    if i % 2 == 0:
        result.sort()
        print(result[i//2], end=" ")
    


# 1 2 4 5 6 7 9 10 11
# 1 2 5 7 9 
# 2 : 1
# 4 : 2
# 6 : 3