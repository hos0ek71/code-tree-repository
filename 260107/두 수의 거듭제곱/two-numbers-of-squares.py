a, b = map(int, input().split())

# Please write your code here.

def mul(a, b):
    cnt = 1
    for i in range(1,b+1):
        cnt *= a 
    return cnt

print(mul(a,b))
