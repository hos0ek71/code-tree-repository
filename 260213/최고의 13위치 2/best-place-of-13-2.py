n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]

# 전체 두 블록 합의 최댓값을 저장할 변수
ans_max = 0

# 1. 첫 번째 1x3 블록 선택
for i in range(n):
    for j in range(n-2):
        sum1 = arr[i][j] + arr[i][j+1] + arr[i][j+2]
        
        # 2. 두 번째 1x3 블록 선택
        for k in range(i, n):
            # 행이 같을 때와 다를 때, l의 시작점이 달라야 합니다!
            if i == k:
                # 같은 줄이면 첫 번째 블록과 겹치지 않게 j+3 부터 시작
                start_l = j + 3
            else:
                # 다른 줄(아랫줄)이면 겹칠 일 없으니 0 부터 시작
                start_l = 0
                
            for l in range(start_l, n-2):
                sum2 = arr[k][l] + arr[k][l+1] + arr[k][l+2]
                
                # 3. 두 블록 합의 최댓값 갱신 (if문에 종속되지 않음!)
                ans_max = max(ans_max, sum1 + sum2)

print(ans_max)