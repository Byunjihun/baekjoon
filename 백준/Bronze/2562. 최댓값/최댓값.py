import sys
numbers = [int(input()) for _ in range(9)]

max_num = max(numbers)
max_index = numbers.index(max_num) + 1

print(max_num)
print(max_index)