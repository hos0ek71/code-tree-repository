s = input()

for char in s:
    if(char.isupper()):
        print(char.lower(), end="")
    elif(char.islower()):
        print(char.upper(), end="")
