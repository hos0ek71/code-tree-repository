n = int(input())
nums = list(map(int, input().split()))

# Please write your code here.

# 1 2 3 5 7 8 

# 2 3 5 5 

nums.sort()
lenth = len(nums)
result = 0

for i in range(lenth//2):
    sum = nums[i] + nums[lenth-i-1]
    if result < sum:
        result = sum 

print(result)

