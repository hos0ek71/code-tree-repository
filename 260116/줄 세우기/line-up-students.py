n = int(input())
students = [tuple(map(int, input().split())) + (i + 1,) for i in range(n)]

students.sort(key = lambda x : (-x[0], -x[1], x[2]))

for value in students:
    print(value[0], value[1], value[2])
# Please write your code here.

