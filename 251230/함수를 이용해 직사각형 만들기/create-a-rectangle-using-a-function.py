n, m = map(int, input().split())

# Please write your code here.

def rect(n,m):
    for i in range(n):
        for j in range(m):
            print(1, end="")
        print()

rect(n,m)