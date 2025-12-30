n, name= input().split(" ")
result = 0

for i in range(int(n)):
    key = input()
    if key == name:
        result += 1
        

print(result)