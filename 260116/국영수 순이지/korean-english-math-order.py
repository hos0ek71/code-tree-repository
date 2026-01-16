class GradeReport:
    def __init__(self,name, kor, eng, math):
        self.name = name
        self.kor = int(kor)
        self.eng = int(eng)
        self.math = int(math)

n = int(input())


arr = [input().split() for _ in range(n)]
subject = [GradeReport(name, kor, eng, math) for name, kor, eng, math in arr]

subject.sort(key = lambda x : (-x.kor, -x.eng, -x.math))

for point in subject:
    print(point.name, point.kor, point.eng, point.math)

    

# Please write your code here.