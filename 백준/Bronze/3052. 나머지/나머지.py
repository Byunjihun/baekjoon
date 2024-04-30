a = set()

for _ in range(10):
    num = int(input())
    b = num % 42
    a.add(b)
    
print(len(a))