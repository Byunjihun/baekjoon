N = int(input())
scores = list(map(int, input().split()))

max_score = max(scores)

new_sum = sum(score / max_score * 100 for score in scores)
new_avg = new_sum / N

print(new_avg)