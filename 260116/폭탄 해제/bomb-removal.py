unlock_code, wire_color, seconds = input().split()
seconds = int(seconds)

# Please write your code here.

class boom:
    def __init__(self, code, color, sec):
        self.code = code
        self.color = color
        self.sec = sec

terror = boom(unlock_code, wire_color, seconds)

print(f"code : {terror.code}")
print(f"color : {terror.color}")
print(f"second : {terror.sec}")