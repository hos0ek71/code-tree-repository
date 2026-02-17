abilities = list(map(int, input().split()))

# Please write your code here.
abSum = 0 
for value in abilities:
    abSum += value

length = len(abilities)
minNum = 1000000

for i in range(length-3+1):
    sum = 0 
    for j in range(i,i+3):
        for k in range(i,j+1):
            sum += abilities[k]

        sum2 = abSum - sum
        minNum = min(minNum , abs(sum2-sum))

print(minNum)
        
            
        

