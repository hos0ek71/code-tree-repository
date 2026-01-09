n = int(input())
arr = list(map(int, input().split()))

# Please write your code here.

def jal(arr,leng):
    for i in range (leng):
        if arr[i] < 0:
            arr[i] = arr[i] * -1

jal(arr,n)
for elem in arr:
    print(elem, end=" ")