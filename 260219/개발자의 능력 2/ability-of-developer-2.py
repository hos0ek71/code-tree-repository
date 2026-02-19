ability = list(map(int, input().split()))

# Please write your code here.
sum = 0 
for value in ability:
    sum += value
diffteam = 1000000

for i in range(6):
    for j in range(i+1, 6):
        
        for k in range(6):
            for l in range(k+1, 6):

                if k == i or k == j or l == i or l == j:
                    continue
                minteam = 0 
                maxteam = 0

                team1 = ability[i] + ability[j]
                team2 = ability[k] + ability[l]
                team3 = sum - (team1+team2)
                
                minteam = min(team1,team2,team3)
                maxteam = max(team1,team2,team3)

                diffteam = min(diffteam, maxteam - minteam)

print(difftea)




        
    
