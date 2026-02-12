n = int(input())
S = input()

# Please write your code here.
cnt = 0 
for i in range(n):
    if S[i] == 'C':
        for j in range(i,n):
            if S[j] == 'O':
                for k in range(j,n):
                    if S[k] == 'W':
                        cnt += 1

print(cnt)