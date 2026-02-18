N = int(input())
a1, b1, c1 = map(int, input().split())
a2, b2, c2 = map(int, input().split())


def is_close(x, y, n):
    diff = abs(x - y)
    # 직선 거리 2 이하 또는 원형 거리(전체길이 - 직선거리) 2 이하
    return diff <= 2 or (n - diff) <= 2
# Please write your code here.
cnt = 0 
for i in range(1, N+1):
    for j in range(1, N+1):
        for k in range(1, N+1):
            match1= is_close(a1,i,N) and is_close(b1,j,N) and is_close(c1,k,N)

            match2= is_close(a2,i,N) and is_close(b2,j,N) and is_close(c2,k,N)

            if match1 or match2:
                cnt += 1

print(cnt)

        

            
            

            
            