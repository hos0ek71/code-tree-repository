MAX_N = 5

agents = []

class agent:
    def __init__(self, name, point):
        self.n = name
        self.p = point


for _ in range(MAX_N):
    codename, score = input().split()
    agents.append(agent(codename, score))

# Please write your code here.
min = 100000
idx = 0

for i in range(5):
    agt = agents[i]
    if int(agt.p) < int(min):
        min = agt.p
        idx = i

minAgent = agents[idx]
print(minAgent.n, minAgent.p)

    

