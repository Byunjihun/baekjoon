word = input()

positions = [-1] * 26

for idx, char in enumerate(word):
    char_idx = ord(char) - ord('a')  
    if positions[char_idx] == -1:   
        positions[char_idx] = idx

for pos in positions:
    print(pos, end=' ')
