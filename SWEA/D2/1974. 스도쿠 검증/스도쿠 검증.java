import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int[][] sudoku = new int[9][9];

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sudoku[i][j] = sc.nextInt();
                }
            }

            boolean isValid = true;

            for (int i = 0; i < 9; i++) {
                if (!checkNum(sudoku[i])) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                for (int i = 0; i < 9; i++) {
                    int[] col = new int[9];
                    for (int j = 0; j < 9; j++) {
                        col[j] = sudoku[j][i];
                    }
                    if (!checkNum(col)) {
                        isValid = false;
                        break;
                    }
                }
            }

            if (isValid) {
                for (int i = 0; i < 9; i += 3) {
                    for (int j = 0; j < 9; j += 3) {
                        int[] block = new int[9];
                        int idx = 0;
                        for (int x = i; x < i + 3; x++) {
                            for (int y = j; y < j + 3; y++) {
                                block[idx++] = sudoku[x][y];
                            }
                        }
                        if (!checkNum(block)) {
                            isValid = false;
                            break;
                        }
                    }
                }
            }

            System.out.printf("#%d %d\n", test_case, isValid ? 1 : 0);
        }
    }

    private static boolean checkNum(int[] nums) {
        boolean[] seen = new boolean[10];
        for (int num : nums) {
            if (seen[num]) {
                return false;
            }
            seen[num] = true;
        }
        return true;
    }
}
