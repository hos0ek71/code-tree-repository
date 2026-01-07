a, b = map(int, input().split())

cnt = 0
for i in range(a, b + 1):
    # 1. 숫자를 문자열로 변환 (예: 135 -> "135")
    s = str(i)
    
    # 2. '3', '6', '9'가 문자열 안에 있는지 확인하거나 3의 배수인지 확인
    has_369 = ('3' in s) or ('6' in s) or ('9' in s)
    is_mul_3 = (i % 3 == 0)
    
    if has_369 or is_mul_3:
        cnt += 1

print(cnt)