n = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))

# Please write your code here.

A.sort()
B.sort()


def asdf(n):

    for i in range(n):
        if A[i] != B[i]:
            return False
    return True

if asdf(n):
    print("Yes")
else :
    print("No")