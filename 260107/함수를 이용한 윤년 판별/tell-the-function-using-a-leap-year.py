y = int(input())

# Please write your code here.

def yoon(n):
    if n % 4 == 0 and n % 100 != 0:
        return True
    elif n % 400 == 0:
        return True
    return False

if yoon(y):
    print("true")
else:
    print("false")