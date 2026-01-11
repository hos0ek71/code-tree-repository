n = int(input())

# Please write your code here.

def number(n):
    if n == 0:
        return 
    
    print(n , end=" ")
    number(n-1)

def number2(n):
    if n == 0:
        return 

    number2(n-1)
    print(n, end=" ")

number2(n)
print()
number(n)