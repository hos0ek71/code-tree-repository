n, k, t = input().split()
n, k = int(n), int(k)
str = [input() for _ in range(n)]

# Please write your code here.
restr = []  
lenT= len(t)

def replace(arr):
    cnt = 0
    for i in range(lenT):
        if arr[i] == t[i]:
            cnt +=1 
        else:
            return False

        if cnt == lenT:
            restr.append(arr)
            break
        
    # if arr[0] == 'a' and arr[1] == 'p':
    #     restr.append(arr)
     
    return restr
    

for elem in str:
    replace(elem)

restr.sort()

for i in range(n):
    if i == k-1:
        print(restr[i])





