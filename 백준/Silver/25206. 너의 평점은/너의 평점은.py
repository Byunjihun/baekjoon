score_board = {'A+': 4.5, 'A0': 4.0, 'B+': 3.5, 'B0': 3.0, 'C+': 2.5, 'C0': 2.0, 'D+': 1.5, 'D0': 1.0, 'F': 0.0, 'P': 0.0}

total_score = 0
total_credit = 0

for i in range(20):
    subject_name, score, grade = input().split()
    score = float(score)
    if grade != 'P':  
        total_score += score * score_board[grade]
        total_credit += score

if total_credit == 0:  
    print(0.0)
else:
    major_gpa = total_score / total_credit
    print(format(major_gpa, ".6f")) 