n = int(input())
arr = [int(input()) for _ in range(n)]

# Please write your code here.

# 현재와 다음꺼 비교한다
# 현재보다 다음께 작지않으면 카운팅
# 작으면 카운트 1 부터 시작
# 카운트 한게 최고값보다 크면 대입

maxNum = -1
cnt = 0
for i in range(n):
    if i == 0:
        cnt = 1
    elif arr[i] > arr[i-1]:
        cnt += 1
    else:
        cnt = 1

    if cnt > maxNum:
        maxNum = cnt 
    
print(maxNum)