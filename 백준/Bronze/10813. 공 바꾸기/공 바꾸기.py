N,M = map(int, input().split())

baskets = list(range(1,N+1))

def swap(ball1, ball2):
    baskets[ball1-1], baskets[ball2-1] = baskets[ball2-1], baskets[ball1-1]  

for _ in range(M):
    i,j = map(int, input().split())
    swap(i,j)
    
print(*baskets)