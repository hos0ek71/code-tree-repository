n = int(input())

# Please write your code here.

def jac(n):
    if n <= 1:
        return 0
    
    if n % 2 == 0:
        return 1 + jac(n // 2)
    else :
        return 1 + jac(n * 3 + 1)

print(jac(n))