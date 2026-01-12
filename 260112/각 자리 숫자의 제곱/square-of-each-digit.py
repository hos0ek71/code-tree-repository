N = int(input())

# Please write your code here.

def mul(N):
    if N < 10:
        return N ** 2         
        
    return (N % 10) ** 2 + mul(N//10)
    
     

print(mul(N))