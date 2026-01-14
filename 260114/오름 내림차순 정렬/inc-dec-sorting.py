n = int(input())
nums = list(map(int, input().split()))

# Please write your code here.

for i in range(2):
    if i == 0:
        nums.sort()
        for elem in nums:
            print(elem, end = " ")
    else:
        nums.sort(reverse=True)
        for elem in nums:
            print(elem, end = " ")
    print()
