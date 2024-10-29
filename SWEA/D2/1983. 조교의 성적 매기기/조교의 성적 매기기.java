import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] grades = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            double[][] score = new double[N][2];

            for (int i = 0; i < N; i++) {
                int midterm_score = sc.nextInt();
                int final_score = sc.nextInt();
                int assignment_score = sc.nextInt();
                score[i][0] = (midterm_score * 0.35) + (final_score * 0.45) + (assignment_score * 0.2);
                score[i][1] = i;
            }

            Arrays.sort(score, (a, b) -> Double.compare(b[0], a[0]));

            int distribution_number = N / 10;
            String result[] = new String[N];

            for (int i = 0; i < N; i++) {
                result[(int) score[i][1]] = grades[i / distribution_number];
            }

            System.out.println("#" + test_case + " " + result[K - 1]);
        }
    }
}