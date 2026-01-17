n = int(input())
sequence = list(map(int, input().split()))

# Please write your code here.


idx = []
visit = [False] * n 
new_sequence = sorted(sequence)


for i in range(n):
    for j in range(n):
        if sequence[i] == new_sequence[j] and not visit[j]:
            idx.append(j+1)
            visit[j] = True
            break
    

        
for value in idx:
    print(value, end = " ")
