n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.

maxNum = 0
secMaxNum = 0 
for i in range(n):
    for j in range(n-2):
        if maxNum < (arr[i][j] + arr[i][j+1] + arr[i][j+2]):
            maxNum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
            secMaxNum = 0 
            for k in range(i+1, n):
                for l in range(n-2):
                    secMaxNum = max(arr[k][l]+arr[k][l+1]+arr[k][l+2], secMaxNum)
                    
print(maxNum + secMaxNum)
        
    

            