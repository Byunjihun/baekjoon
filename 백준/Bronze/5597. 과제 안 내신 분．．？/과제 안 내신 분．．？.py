people = list(range(1,31))

for i in range(28):
    n = int(input())
    people.remove(n)
print(min(people))
print(max(people))