a, b = map(int, input().split())

# Please write your code here.

def sosu(n):
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

def odd(n):
    cnt = 0
    while n > 0:
        cnt += n % 10
        n = n // 10

    if cnt % 2 == 0:
        return True
    else:
        return False


def magic(n):
    if sosu(n) and odd(n):
        return True

cnt = 0
for i in range(a, b+1):
    if magic(i):
        cnt += 1
        
print(cnt)


