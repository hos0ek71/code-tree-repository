n = int(input())
arr = list(map(int, input().split()))

# Please write your code here.

def div(n):
    for i in range(n):
        if arr[i] % 2 == 0:
            arr[i] //= 2

div(n)

for elem in arr:
    print(elem, end=" ")