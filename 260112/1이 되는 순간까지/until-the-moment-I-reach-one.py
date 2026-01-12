N = int(input())

def jagui(N):
    if N == 1:
        return 0 # 1에 도달하면 더 이상 더할 단계가 없음
    
    if N % 2 == 0:
        # "1단계(나) + 나머지 단계들(너)"
        return 1 + jagui(N // 2)
    else:
        return 1 + jagui(N // 3)

# 출력할 때
print(jagui(N))