a, b = map(int, input().split())

# Please write your code here.

def ab(a, b) :
    if a >= b:
        return a + 25, b * 2
    else:
        return a * 2, b + 25

a, b= ab(a,b)
print(a, b, end=" ")