N = int(input())

# Please write your code here.

def mul(N):
    if N < 10:
        return N
    return mul (N // 10) + N*N