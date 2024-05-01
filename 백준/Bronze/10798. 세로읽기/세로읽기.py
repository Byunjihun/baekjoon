word = [list(input()) for i in range(5)]

for i in range(max(len(i) for i in word)):
    for j in range(5):
        if i< len(word[j]):
            print(word[j][i],end='')

