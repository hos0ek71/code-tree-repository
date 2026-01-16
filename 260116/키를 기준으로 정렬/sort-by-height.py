class person:
    def __init__(self, name, height, weight):
        self.name = name
        self.height = height 
        self.weight = weight


n = int(input())


arr = [input().split() for _ in range(n)]
persons = [person(n_i, h_i, w_i) for n_i, h_i, w_i in arr]

persons.sort(key = lambda x : x.height)

for date in persons:
    print(date.name, date.height, date.weight)


    

# Please write your code here.