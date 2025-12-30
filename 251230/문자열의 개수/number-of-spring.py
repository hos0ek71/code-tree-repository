words = []  # 문자열을 담을 리스트

while True:
    string = input()  # 한 줄씩 입력받기
    
    if string == '0': # 입력이 '0'이면 종료
        break
    
    words.append(string) # '0'이 아니면 리스트에 추가

# 1. 전체 개수 출력
print(len(words))

# 2. 홀수 번째 문자열 출력 (1번째, 3번째, 5번째...)
# 리스트 인덱스는 0부터 시작하므로 인덱스 0, 2, 4...를 출력해야 합니다.
for i in range(len(words)):
    if i % 2 == 0:  # 인덱스가 짝수인 경우가 실제로는 홀수 번째
        print(words[i])