N = int(input())

# Please write your code here.

def asdf(N):
    if N == 1:
        return 1
    if N == 2:
        return 2
    
    return N + asdf(N-2)

print(asdf(N))

