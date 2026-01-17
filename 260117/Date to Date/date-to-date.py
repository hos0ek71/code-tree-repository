m1, d1, m2, d2 = map(int, input().split())


date = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 ]

elpasedTime = 0
month = m1
day = d1

while True:

    if month == m2  and day == d2:
        break
    
    day += 1
    elpasedTime += 1

    if day > date[month]:
        month +=1
        day = 1

print(elpasedTime+1)
# Please write your code here.
