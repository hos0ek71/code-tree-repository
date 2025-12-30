s = input()
for char in s:
    if char.isalpha() or char.isdigit():
        print(char.lower(), end="")