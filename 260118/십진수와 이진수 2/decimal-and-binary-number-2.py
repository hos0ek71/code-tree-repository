N = input()

# Please write your code here.
sum = 0; 
for i in range(len(N)):
    sum = sum * 2 + int(N[i])

sum = sum * 17

arr = []
cnt = 0

while True:

    if sum < 2:
        
        arr.append(sum)
        break

    
    arr.append(sum % 2)
    sum = sum // 2



for i in range(len(arr)-1, -1 , -1):
    print(arr[i], end = "")



