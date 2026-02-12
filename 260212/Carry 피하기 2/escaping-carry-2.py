n = int(input())
arr = [int(input()) for _ in range(n)]

# Please write your code here.

def notCarry(a,b,c):
   
    aDiv = a % 10
    bDiv = b % 10
    cDiv = c % 10 

    if aDiv + bDiv + cDiv >= 10:
        return False

    if a < 10 and b < 10 and c < 10:
        return True

    return notCarry(a//10, b//10, c//10)

carry = 0 
maxNum = 0 
for i in range(n):
    for j in range(i+1,n):
        for k in range(j+1,n):
            if notCarry(arr[i], arr[j], arr[k]):
                carry = arr[i] + arr[j] + arr[k]
                # print(arr[i], arr[j], arr[k], end=" ")
                # print(carry)
                maxNum = max(carry,maxNum)
                
print(maxNum)
