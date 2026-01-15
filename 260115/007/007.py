secret_code, meeting_point, time = input().split()
time = int(time)

# Please write your code here.

class secret:
    def __init__(self, code, place, time):
        self.code = code
        self.place = place
        self.time = time
    
secret = secret(secret_code, meeting_point, time)

print(f"secret code : {secret.code}")
print(f"meeting point : {secret.place}")
print(f"time : {secret.time}")
