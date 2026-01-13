n = int(input())

# Please write your code here.

memo = {}
def jau(n):
    
    if n == 1:
        return 1
    if n == 2:
        return 2
    
    if n in memo:
        return memo[n]

    memo[n] = jau(n // 3) + jau(n-1)

    return memo[n]
    
print(jau(n))