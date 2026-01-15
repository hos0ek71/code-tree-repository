user2_id, user2_level = input().split()
user2_level = int(user2_level)

# Please write your code here.

class user:
    def __init__(self, id="codetree", level = 10):
        self.id = id
        self.level = level


one = user()
two = user("hello", 28)

print(f"user {one.id} lv {one.level}")
print(f"user {two.id} lv {two.level}")