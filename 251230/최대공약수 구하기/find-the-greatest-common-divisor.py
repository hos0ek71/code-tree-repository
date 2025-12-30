n, m = map(int, input().split())

# Please write your code here.

def get_gcd (n,m) :
    while n > 0:
        man = m % n
        m = n
        n = man
    return m

result = get_gcd(n, m)
print(result)