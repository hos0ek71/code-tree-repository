n = int(input())
arr = list(map(int, input().split()))

# 1. 먼저 최대공약수(GCD)를 구하는 재귀함수가 필요합니다.
def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

# 2. 두 수의 최소공배수(LCM)를 구하는 함수입니다.
def get_lcm(a, b):
    return (a * b) // gcd(a, b)

# 3. 리스트 전체의 최소공배수를 구하는 재귀함수입니다.
def 최소공배수(idx):
    # [종료 조건] 첫 번째 원소까지 내려왔다면 그 값을 반환하고 멈춤
    if idx == 0:
        return arr[0]
    
    # [재귀 단계] 현재 원소와 (이전 원소들의 최소공배수 결과)를 계산
    return get_lcm(arr[idx], 최소공배수(idx - 1))

# 호출할 때는 마지막 인덱스(n-1)부터 시작합니다.
print(최소공배수(n - 1))