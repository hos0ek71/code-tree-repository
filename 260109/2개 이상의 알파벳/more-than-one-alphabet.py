A = input()

# Please write your code here.
leng = len(A)

def dif2(A, leng):

    fisrt = A[0]
    cnt = 1
    
    for i in range(1, leng):

        if A[i] != fisrt:

            cnt += 1

        if cnt == 2:
            return True
        
        first = A[i]
    
    return False

if dif2(A,leng):
    print("Yes")
else:
    print("No")

