class person:
    def __init__(self, name, road, street):
        self.n = name
        self.r = road
        self.s = street

n = int(input())
arr = [tuple(input().split()) for _ in range(n)]
persons = [person(name, address, region) for name, address, region in arr]

idx = 0 

for i in range(1,n):
    if persons[idx].n < persons[i].n:
        idx = i
        
print(f"name {persons[idx].n}")
print(f"addr {persons[idx].r}")
print(f"city {persons[idx].s}")




