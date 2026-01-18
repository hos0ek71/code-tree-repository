m1, d1, m2, d2 = map(int, input().split())
A = input()

# Please write your code here.



weekday =  [0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

mapping = {"Mon": 0, "Tue": 1, "Wed": 2, "Thu": 3, "Fri": 4, "Sat": 5, "Sun": 6}
targetIndex = mapping[A]
elapsedTime = 0
cnt = 0 

while True:
    
    if elapsedTime % 7 == targetIndex :
        cnt += 1

    # 2. 오늘이 끝나는 날짜라면 여기서 종료 (오늘 요일은 이미 셌음)
    if m1 == m2 and d1 == d2:
        break
    
    # 3. 이제 하루를 진행시킴
    d1 += 1
    elapsedTime += 1

    # 4. 월말 처리
    if d1 > weekday[m1]:
        d1 = 1
        m1 += 1

print(cnt)
