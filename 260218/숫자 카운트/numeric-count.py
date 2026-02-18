n = int(input())
a, b, c = [], [], []
for _ in range(n):
    num, cnt1, cnt2 = map(int, input().split())
    a.append(num)
    b.append(cnt1)
    c.append(cnt2)

# Please write your code here.

#랜덤으로 A의 세자리 수 설정
#B는 N 만큼 

 조건 중 1번 카운트가 큰 수 부터 풀이 진행
 2가 나온거 있으면 그거 픽스 하고 그 안에서 

0 0 -> 건질 수가 없음 
0 1 -> 
0 2
0 3

1 0
1 1 -> 
1 2 -> 하나는 픽스 * 두 자리 위치 바꾸기 (3가지 경우)

2 0 -> 두자리만 확정 (3가지 경우) , 하나 버림 
2 1 -> 가능성 없음

3 0 -> 정답


