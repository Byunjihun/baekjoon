import sys

N= int(input())
numbers = list(map(int,sys.stdin.readline().split()))
v = int(input()) 

count = numbers.count(v)

print(count)