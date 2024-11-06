import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int[][] map = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            String[][] str_90 = new String[N][N];
            String[][] str_180 = new String[N][N];
            String[][] str_270 = new String[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    str_90[j][N - i - 1] = String.valueOf(map[i][j]);
                    str_180[N - i - 1][N - j - 1] = String.valueOf(map[i][j]);
                    str_270[N - j - 1][i] = String.valueOf(map[i][j]);
                }
            }

            System.out.println("#" + test_case);
            for (int i = 0; i < N; i++) {
                System.out.print(String.join("", str_90[i]) + " ");
                System.out.print(String.join("", str_180[i]) + " ");
                System.out.print(String.join("", str_270[i]) + " ");
                System.out.println();
            }
        }
    }
}