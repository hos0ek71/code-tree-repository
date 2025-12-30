s,s2 = input().split()

result1 = ""
result2 = ""

for char in s:
    if char.isdigit():
        result1 += char
    else:
        break

for char in s2:
    if char.isdigit():
        result2 += char
    else:
        break

print(int(result1) + int(result2))