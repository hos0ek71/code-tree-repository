a, b = map(int, input().split())

# Please write your code here.

def one_num(i):
    return (i % 10 == 3 or i % 10 == 6 or i % 10 == 9)

def ten_num(i):
    return (i // 10 == 3 or i // 10 == 6 or i // 10 == 9)

def magic_num(i):
    return (ten_num(i) or one_num(i))
    
def mul_three_num(i):
    return (i % 3 == 0)

cnt = 0
for i in range(a,b+1):
    if magic_num(i) or mul_three_num(i):
        cnt += 1

print(cnt)