s = input()
s2 = input()

result = ""
result2 = ""

for char in s:
    if(char.isdigit()):
        result += char

for char in s2:
    if(char.isdigit()):
        result2 += char

print(int(result) + int(result2))

