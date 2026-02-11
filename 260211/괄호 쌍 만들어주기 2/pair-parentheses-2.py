A = input()

# Please write your code here.

result = 0 

for i in range(len(A)-1):

    if A[i] == '(' and A[i+1] == '(':
            for j in range(i, len(A)-1):
                if A[j] == ')' and A[j+1] == ')':
                    result += 1

print(result)