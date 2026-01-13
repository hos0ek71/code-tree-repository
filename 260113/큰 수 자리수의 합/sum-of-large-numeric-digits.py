a, b, c = map(int, input().split())

# Please write your code here.

def mul(a, b, c):
    return a * b * c

n = mul(a,b,c)

def plus(n):

    if n < 10:
        return n

    return plus(n // 10) + (n % 10)

print(plus(n))