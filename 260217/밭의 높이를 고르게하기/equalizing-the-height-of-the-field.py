N, H, T = map(int, input().split())
arr = list(map(int, input().split()))

# Please write your code here.

minNum = 20000
for i in range(N):
    for j in range(i, N):
        arr2 = arr
        add = 0 
        
        for idx, k in enumerate(range(i, j + 1)):
            
            add += abs(H - arr2[k])

            # print(f"구간: {k}, 횟수 : {idx+1}, 그구간의 비용 : {add}")

        # print()
        
        
        if idx+1 >= T:
            minNum = min(add, minNum)
            
            # print()
        
            

print(minNum)

        



