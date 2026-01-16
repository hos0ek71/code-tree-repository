n = int(input())


person = [(s[0], int(s[1]), int(s[2]))  for s in (input().split() for _ in range(n))]

person.sort(key= lambda x : (x[1], -x[2]))
   
for value in person:
    print(value[0], value[1], value[2])

# Please write your code here.