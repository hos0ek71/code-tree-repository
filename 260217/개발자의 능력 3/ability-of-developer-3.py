abilities = list(map(int, input().split()))

# Please write your code here.
abSum = 0 
for value in abilities:
    abSum += value

minNum = 1000000

for i in range(4):
    sum = 0 
    for j in range(i+1,5):
        for k in range(j+1, 6):

            sum = abilities[i] + abilities[j] + abilities[k]

            sum2 = abSum - sum
        
            minNum = min(minNum , abs(sum2-sum))

print(minNum)
        
            
        

