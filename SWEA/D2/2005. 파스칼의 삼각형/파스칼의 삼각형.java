import java.io.IOException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            System.out.println("#" + t);
            int[][] triangle = new int[N][N];
            for (int i = 0; i < N; i++) {
                triangle[i][0] = 1;
                for (int j = 1; j <= i; j++) {
                    if (i > j) {
                        triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                    } else {
                        triangle[i][j] = 1;
                    }
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(triangle[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}