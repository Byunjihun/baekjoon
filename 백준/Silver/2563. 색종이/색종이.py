N = int(input())
map_array = [[0] * 100 for _ in range(100)]

for _ in range(N):
    x, y = map(int, input().split())
    for i in range(x, x+10):
        idx_x = i
        for j in range(y, y+10):
            idx_y = j
            if map_array[idx_x][idx_y] == 0:
                map_array[idx_x][idx_y] = 1
            else:
                pass
sum_array = 0
for i in range(100):
    sum_array += sum(map_array[i])
print(sum_array)
