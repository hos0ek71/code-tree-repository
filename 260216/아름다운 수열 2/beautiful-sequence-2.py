N, M = map(int, input().split())
A = list(map(int, input().split()))
B = list(map(str, input().split()))

# Please write your code here.

cnt = 0 
sortB = sorted(B)

for i in range(N-M+1):
    sum = ""

    for j in range(i,i+M):
        sum += str(A[j])

    sortA = sorted(sum)
    # print(sortA, sortB)

    if  sortA == sortB:
        cnt += 1

print(cnt)

