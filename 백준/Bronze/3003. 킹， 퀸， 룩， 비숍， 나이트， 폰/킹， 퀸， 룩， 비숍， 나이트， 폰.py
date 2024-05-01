chess = [1,1,2,2,2,8]

chess_input = list(map(int,input().split()))

new_list = []
for i in range(len(chess)):
    new_list.append(chess[i] - chess_input[i])
print(*new_list)