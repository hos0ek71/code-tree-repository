n, m = map(int, input().split())
A = list(map(int, input().split()))

# Please write your code here.

def makeM():
        global m 

        if  m % 2 == 1:
            m -= 1

        else :
            m //= 2
    

def findIdx(n):
    result = 0
    for i in range(n):
        result = result + A[m-1]
        makeM()
        if m < 1:
            break
        
    return result

print(findIdx(n))
        

