students = list(range(1,31))

for _ in range(28):
    applied = int(input())
    students.remove(applied)

print(min(students))
print(max(students))