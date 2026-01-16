n = 5

def ascil(arr):
    result = 0 

    lenth = len(arr)
    for i in range(lenth):
        result += ord(arr[i])
    return result



# input().split()의 결과 중 s[1]만 int로 변환하여 튜플로 구성
person = [( (s[0]), int(s[1]), s[2] ) for s in (input().split() for _ in range(n))]

# 이미 1번 인덱스가 int이므로 -x[1]만 해도 계산이 됩니다.
person.sort(key = lambda x : (x[0]))

print("name")
for value in person:
    print(value[0], value[1], value[2])
    
print()

person.sort(key = lambda x : (-x[1]))

print("height")
for value in person:
    print(value[0], value[1], value[2])