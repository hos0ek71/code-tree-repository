A = input()
# Please write your code here.


def drome(arr):
    left, right = 0, len(arr) - 1
    while left < right:
        if arr[left] != arr[right]:
            return False
        left += 1
        right -= 1
    return True

if drome(A):
    print("Yes")
else:
    print("No")