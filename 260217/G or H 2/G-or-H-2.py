n = int(input())
people = [tuple(input().split()) for _ in range(n)]
pos = [int(p[0]) for p in people]
alpha = [p[1] for p in people]

# Please write your code here.
arr = [0] * 101

for p, a in zip(pos, alpha):
    arr[p] = a


maxNum = 0 
for i in range(101):
    G = 0 
    H = 0 

    
    for j in range(i,101):
        if arr[i] == 0 or arr[j] == 0:
            continue
            
        if arr[j] == 'G':
            G += 1
        elif arr[j] == 'H':
            H += 1

        if G == H or (G == 0 and H > 0) or (H == 0 and G > 0):
            maxNum = max(j-i, maxNum)

print(maxNum)