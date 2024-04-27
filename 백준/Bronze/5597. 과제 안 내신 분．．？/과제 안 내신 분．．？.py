attendance = [False] * 30

for _ in range(28):
    n = int(input())
    attendance[n - 1] = True

Not_submitted = []
for i, is_attendance in enumerate(attendance):
    if not is_attendance:
        Not_submitted.append(i + 1)

print(min(Not_submitted))
print(max(Not_submitted))