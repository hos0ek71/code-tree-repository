n = int(input())
arr = list(map(int, input().split()))

# Please write your code here.

def maxnum(n):
    if n == 0:
        return arr[0];

    prvenum = maxnum(n-1)

    if prvenum > arr[n]:
        return prvenum
    else:
        return arr[n]
    
print(maxnum(n-1))