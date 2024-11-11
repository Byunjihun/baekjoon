import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int test_case = 1; test_case <= 10; test_case++) {
            int testCaseNumber = sc.nextInt();
            int[][] numArray = new int[100][100];
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    numArray[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < 100; i++) {
                int rowSum = 0;
                for (int j = 0; j < 100; j++) {
                    rowSum += numArray[i][j];
                }
                max = Math.max(max, rowSum);
            }

            for (int j = 0; j < 100; j++) {
                int colSum = 0;
                for (int i = 0; i < 100; i++) {
                    colSum += numArray[i][j];
                }
                max = Math.max(max, colSum);
            }

            int diagonalSum1 = 0;
            for (int i = 0; i < 100; i++) {
                diagonalSum1 += numArray[i][i];
            }
            max = Math.max(max, diagonalSum1);

            int diagonalSum2 = 0;
            for (int i = 0; i < 100; i++) {
                diagonalSum2 += numArray[i][99 - i];
            }
            max = Math.max(max, diagonalSum2);

            System.out.println("#" + test_case + " " + max);
        }
        sc.close();
    }
}
