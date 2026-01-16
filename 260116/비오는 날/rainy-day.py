import sys
class weathers:
    def __init__(self, date, weekday, weather):
        self.date = date
        self.weekday = weekday
        self.weather = weather

def minusStr(date):
    listDate= list(date)
    for i in range(10):
        if listDate[i] == '-':
            listDate[i] = ""
    return int("".join(listDate))

n = int(input())
arr = [tuple(input().split()) for _ in range(n)]
futureDate = [weathers(date, weekday, weather) for date, weekday, weather in arr]

minDate = float('inf')
idx = 0
for i, weather in enumerate(futureDate):
    
    if futureDate[i].weather == "Rain":
        currentDate = minusStr(futureDate[i].date)
        if currentDate < minDate:
            minDate = currentDate
            idx = i


print(futureDate[idx].date, futureDate[idx].weekday,futureDate[idx].weather)
    

# Please write your code here.





# print(minusStr("2036-12-27"))