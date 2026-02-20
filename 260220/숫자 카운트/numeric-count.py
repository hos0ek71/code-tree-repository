n = int(input())
hints = []
for _ in range(n):
    num, s, b = input().split()
    hints.append([num, int(s), int(b)])

cnt = 0 
for i in range(1, 10):
    for j in range(1, 10):
        for k in range(1, 10):

            if i != j and i != k and j != k:

                candidate = str(i) + str(j) + str(k)
                result = True

                for hint_nums, hint_s, hint_b in hints:
                    strike = 0 
                    ball = 0 

                    for x in range(3):
                        for y in range(3):
                            if candidate[x] == hint_nums[y]:
                                if x == y:
                                    strike += 1
                                else:
                                    ball += 1

                    if hint_s != strike or hint_b != ball:
                        result = False
                        break
                
                if result:
                    cnt += 1
                    
print(cnt) 