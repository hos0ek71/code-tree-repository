n = int(input())

total = 0

for i in range(n):
    i = int(input())
    total += i

result = str(total)
print(result[1:] + result[0])

