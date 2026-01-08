n1, n2 = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

# Please write your code here.


def asdf(n1, n2,a,b):

    str_b = "".join(map(str, b))

    for i in range(n1-n2+1):

        restr = ""

        for j in range(n2):
            restr += str(a[i+j])
           
        if restr == str_b:
            return True

if asdf(n1,n2, a,b):
    print("Yes")
else:
    print("No")