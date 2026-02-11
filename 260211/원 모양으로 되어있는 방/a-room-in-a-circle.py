import sys
n = int(input())
a = [int(input()) for _ in range(n)]

# Please write your code here.

minSum = sys.maxsize

for i in range(n):
    sum = 0
    idx = 0 
    for j in range(n):
        
        if i + j > n-1:
            idx = (i + j) - n  
        else:
            idx = i + j 
        
        # print(i,j, end=",")
        # print(idx)
        
        sum += a[idx] * j 

    if sum < minSum:
        minSum = sum

print(minSum)

# i = 1
# (7 * 0) + (8 * 1) + (6 * 2) + (4 * 3) + (4 * 4) = 0 8 12 12 16 
# [i + j] 0 + [i+j] 1 ... i+j  4
# (-1 * 4) + (0 * 7) + (1 * 8) + 2 * 6 + 3 * 4
# i = 2
# (8 * 0) (6 * 1) (4 * 2) (4 * 3) (7 * 4)
# [2 + j] * 0 2 + j      
