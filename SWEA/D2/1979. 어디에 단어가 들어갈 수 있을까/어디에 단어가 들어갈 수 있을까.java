import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            int[][] map = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            int count = 0;
            for (int i = 0; i < N; i++) {
                int lenth = 0;
                for (int j = 0; j < N; j++) {
                    if (map[i][j] == 1) {
                        lenth++;
                    } else {
                        if (lenth == K) {
                            count++;
                        }
                        lenth = 0;
                    }
                }
                if (lenth == K) {
                    count++;
                }
            }

            for (int j = 0; j < N; j++) {
                int lenth = 0;
                for (int i = 0; i < N; i++) {
                    if (map[i][j] == 1) {
                        lenth++;
                    } else {
                        if (lenth == K) {
                            count++;
                        }
                        lenth = 0;
                    }
                }
                if (lenth == K) {
                    count++;
                }
            }

            System.out.println("#" + test_case + " " + count);
        }
    }
}