text = input()
pattern = input()

leng = len(pattern)
leng2 = len(text)

def find():
    # 1. 시작 지점(i)을 옮겨가며 확인
    for i in range(0, leng2 - leng + 1):
        match = True  # 이번 i지점에서 패턴이 일치하는지 확인할 깃발(Flag)
        
        # 2. i부터 pattern의 길이만큼 한 글자씩 비교
        for j in range(leng):
            if text[i + j] != pattern[j]:
                match = False  # 한 글자라도 다르면 탈출
                break
        
        # 3. 안쪽 루프를 다 돌았는데 match가 여전히 True라면 전부 일치한 것!
        if match:
            return i
            
    return -1  # 끝까지 못 찾았다면 -1 반환

print(find())