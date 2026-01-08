n, m = map(int, input().split())

# Please write your code here.

def swap(a, b):
    swa = b
    b = a
    a = swa
    print(a,b)

swap(n,m)
