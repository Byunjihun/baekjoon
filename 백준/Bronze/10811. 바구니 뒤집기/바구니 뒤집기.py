N,M = map(int,input().split())

numbers = list(range(1,N+1))

def reversed(num1, num2):
    while num1 < num2:
        numbers[num1 - 1] ,numbers[num2 - 1] = numbers[num2 - 1] , numbers[num1 - 1]
        num1 += 1
        num2 -= 1

for _ in range(M):
    i,j = map(int,input().split())
    reversed(i,j)

print(*numbers)