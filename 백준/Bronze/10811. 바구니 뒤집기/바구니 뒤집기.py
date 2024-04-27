N,M = map(int, input().split())

baskets = list(range(1,N+1))

def revers_baskets(start,end):
    while(start < end):
        baskets[start-1],baskets[end-1] = baskets[end-1], baskets[start-1]
        start +=1
        end -= 1
    

for _ in range(M):
    i,j = map(int, input().split())
    revers_baskets(i,j)
    
print(*baskets)
