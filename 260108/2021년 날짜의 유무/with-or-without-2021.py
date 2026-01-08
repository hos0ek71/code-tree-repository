M, D = map(int, input().split())

# Please write your code here.

def date(M,D):
    if M != 2:
        if M > 7:
            if M % 2 == 0:
                return thione(D)
            else:
                return thi(D)
        else:
            if M % 2 == 0:
                return thi(D)
            else:
                return thione(D) 
    else:
        if D <= 28:
            return True
        else:
            return False


def thione(D):
    if D <= 31:

        return True
    else:

        return False

def thi(D):
    if D <= 30:

        return True
    
    else:
        
        return False


if date(M,D):
    print("Yes")
else:
    print("No")

