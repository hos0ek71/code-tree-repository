Y, M, D = map(int, input().split())

def month(M):
    if 3 <= M <= 5:
        return "Spring"
    elif 6 <= M <= 8:
        return "Summer"
    elif 9 <= M <= 11:
        return "Fall"
    elif M == 12 or M == 1 or M == 2:
        return "Winter"

def yoon(Y):
    # 400으로 나누어 떨어지거나, (4로 나누어 떨어지면서 100으로는 안 나누어 떨어질 때)
    if (Y % 400 == 0) or (Y % 4 == 0 and Y % 100 != 0):
        return True
    return False

def checkDay(M, Y):
    if M == 2:
        return 29 if yoon(Y) else 28 # 윤년이면 29, 아니면 28
    elif M in [4, 6, 9, 11]:
        return 30
    else:
        return 31

def day(M, D, Y):
    # 월이 1~12를 벗어나는 경우 처리
    if not (1 <= M <= 12):
        return False
    # 입력된 D가 해당 월의 최대 일수 이하인지 확인
    return 1 <= D <= checkDay(M, Y)

def Season(M, D, Y):
    if day(M, D, Y):
        # 유효한 날짜일 때만 계절을 출력합니다.
        print(month(M))
    else:
        # 날짜가 유효하지 않을 때의 처리 (필요시)
        print(-1)

# 실행 시 Y, M, D를 모두 전달합니다.
Season(M, D, Y)