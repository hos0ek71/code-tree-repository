n = int(input())

# Please write your code here.

def magic(n):
    ten = n // 10
    one = n % 10
    five = ten+one


    if(n % 2 == 0 and five % 5 == 0):
        print("Yes")
    else:
        print("No")

magic(n)