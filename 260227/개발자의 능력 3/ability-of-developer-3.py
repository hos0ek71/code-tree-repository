abilities = list(map(int, input().split()))

# Please write your code here.
abSum = 0 
for value in abilities:
    abSum += value

minNum = 1000000

for i in range(6):
    sum = 0 
    for j in range(i+1, 6):
        for k in range(j+1, 6):
            # print(i,j,k)

            sum = abilities[i] + abilities[j] + abilities[k]

            sum2 = abSum - sum
        
            minNum = min(minNum , abs(sum2-sum))

print(minNum)
        
            
        

