n = int(input())
points = [tuple(map(int, input().split())) + (i + 1,) for i in range(n)]

# 함수가 튜플 하나(p)를 받도록 수정
def 멘하턴(p):
    x, y = p[0], p[1] # 튜플에서 x, y를 꺼냄
    
    return abs(x) + abs(y)
   

# 정렬 실행
points.sort(key=멘하턴)

# 결과 출력
for i in range(n):
    print(points[i][2])