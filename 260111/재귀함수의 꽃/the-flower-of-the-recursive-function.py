N = int(input())

def print_down_up(n):
    if n != 0:
        print(n, end = " ") # 내려가면서 출력
    
    if n == 0:
        return # 0이면 바닥을 찍고 되돌아감
    
    print_down_up(n - 1)
    
    print(n, end = " ")

print_down_up(N)