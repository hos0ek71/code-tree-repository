n, m = map(int, input().split())

# Please write your code here.

def asdf(n, m):
    cnt = 2;
    result = 1;
    while cnt <= n and cnt <= m:

        if n % cnt == 0  and m % cnt == 0 :
            n = n / cnt
            m = m / cnt
            result = result * cnt 
            cnt = 2;
        else :
            cnt += 1
    
    return result * n * m

total = int(asdf(n, m))
print(total)
        


