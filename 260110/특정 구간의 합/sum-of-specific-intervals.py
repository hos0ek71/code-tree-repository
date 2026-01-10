# 수열 A는 전역 변수로 선언
n, m = map(int, input().split())
arr = list(map(int, input().split()))
queries = [tuple(map(int, input().split())) for _ in range(m)]

def find_range_sum():
    # m개의 쿼리를 하나씩 확인
    for i in range(m):
        # 1. 튜플에서 a1, a2를 각각 꺼냄
        a1, a2 = queries[i]
        
        # 2. 구간 합을 구할 변수 초기화
        total = 0
        
        # 3. a1번째부터 a2번째까지 반복 (인덱스는 -1 해줘야 함)
        for idx in range(a1 - 1, a2):
            total += arr[idx]
        
        # 4. 결과 출력
        print(total)

# 함수 실행
find_range_sum()