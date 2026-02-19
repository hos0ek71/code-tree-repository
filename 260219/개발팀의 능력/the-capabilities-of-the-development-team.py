arr = list(map(int, input().split()))

# Please write your code here.
sum = 0 
for value in arr:
    sum += value

ans = 10000
for i in range(5):
    for j in range(i+1, 5):

        for k in range(5):
            for l in range(k+1, 5):
                if i == k or j == k or i == l or j == l:
                    continue

                team1 = arr[i] + arr[j]
                team2 = arr[k] + arr[l]
                team3 = sum - (team1 + team2)
                
                result = max(team1,team2,team3) - min(team1,team2,team3)
                if result > 0:
                    ans = min(ans, result)
                

print(ans)
