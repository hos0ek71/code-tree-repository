a, b, c = map(int, input().split())

# Please write your code here.


def minInt(a, b, c):
    if(a > b):

        if(b < c):
            print(b)

        else:
            print(c)

    elif(a < b):

        if(a > c):
            print(c)

        else:
            print(a)
    
    else:
        print(a)
minInt(a,b,c)