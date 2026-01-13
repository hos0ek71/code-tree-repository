N = int(input())

# Please write your code here.

def pibo(N):
    if N == 1:
        return 1
    if N == 2:
        return 1

    return pibo(N-1) + pibo(N-2)


print(pibo(N))
