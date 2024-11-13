import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int[] days = new int[N];

            for (int i = 0; i < N; i++) {
                days[i] = sc.nextInt();
            }

            long sum = 0;
            int max = Integer.MIN_VALUE;

            for (int i = N - 1; i >= 0; i--) {
                if (max < days[i]) {
                    max = days[i];
                } else {
                    sum += (max - days[i]);
                }
            }
            System.out.println("#" + test_case + " " + sum);
        }
        sc.close();
    }
}