import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int[] list = new int[N];

            for (int i = 0; i < list.length; i++) {
                list[i] = sc.nextInt();
            }

            int max = 0;
            long sum = 0;
            for (int i = N - 1; i >= 0; i--) {
                if (max < list[i]) {
                    max = list[i];
                }

                sum += max - list[i];
            }
            System.out.println("#" + test_case + " " + sum);
        }
    }
}