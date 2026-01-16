class StudentGrade:
    def __init__(self, name, kor, eng, math):
        self.name = name 
        self.kor = int(kor)
        self.eng = int(eng)
        self.math = int(math)

n = int(input())


arr = [input().split() for _ in range(n)]
grade = [StudentGrade(name, kor, eng, math) for name, kor, eng, math in arr ]


grade.sort(key = lambda x : (x.kor+x.eng+x.math))

for value in grade:
    print(value.name, value.kor, value.eng, value.math)

# Please write your code here.