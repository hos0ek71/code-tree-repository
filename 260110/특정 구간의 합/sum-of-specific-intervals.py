# 수열 A는 전역 변수로 선언
n, m = map(int, input().split())
arr = list(map(int, input().split()))
queries = [tuple(map(int, input().split())) for _ in range(m)]
total = 0


def findIdx(a1, a2):
    global total
    total = 0; 
    for i in range(a1-1 , a2):
        total += arr[i]


def find_range_sum():
    # m개의 쿼리를 하나씩 확인
    for i in range(m):
        # 1. 튜플에서 a1, a2를 각각 꺼냄
        a1, a2 = queries[i]

        findIdx(a1, a2)
        print(total)
      

find_range_sum()

