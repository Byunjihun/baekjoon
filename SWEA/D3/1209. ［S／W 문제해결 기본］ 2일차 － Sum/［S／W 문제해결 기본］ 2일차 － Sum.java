import java.util.Scanner;

public class Solution {
    private static int max;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int test_case = 1; test_case <= 10; test_case++) {
            sc.nextInt();
            int[][] numStr = new int[100][100];

            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    numStr[i][j] = sc.nextInt();
                }
            }
            max = 0;

            for (int i = 0; i < 100; i++) {
                int rowSum = 0;
                for (int j = 0; j < 100; j++) {
                    rowSum += numStr[i][j];
                }
                checkMax(rowSum);
            }

            int[] colList = new int[100];
            for (int i = 0; i < 100; i++) {
                int colSum = 0;
                for (int j = 0; j < 100; j++) {
                    colSum += numStr[j][i];
                }
                checkMax(colSum);
            }

            int diagonal1Sum = 0;
            for (int i = 0; i < 100; i++) {
                diagonal1Sum += numStr[i][i];
            }
            checkMax(diagonal1Sum);

            int diagonal2Sum = 0;
            for (int i = 0; i < 100; i++) {
                diagonal2Sum = numStr[i][99 - i];
            }

            checkMax(diagonal2Sum);

            System.out.println("#" + test_case + " " + max);
        }
        
        sc.close();
    }

    private static void checkMax(int sum) {

        if (max < sum) {
            max = sum;
        }
    }
}