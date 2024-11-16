import java.util.Arrays;
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

            boolean Value = true;

            for (int i = 0; i < 9; i++) {
                if (!Check_num(sudoku[i])) {
                    Value = false;
                }
            }

            int[][] col_sudoku = new int[9][9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    col_sudoku[i][j] = sudoku[j][i];
                }
                if (!Check_num(col_sudoku[i])) {
                    Value = false;
                }
            }
            int[] block_sudoku = new int[9];
            for (int i = 0; i < 9; i += 3) {
                for (int j = 0; j < 9; j += 3) {
                    int c = 0;

                    for (int x = 0; x < 3; x++) {
                        for (int y = 0; y < 3; y++) {
                            block_sudoku[c] = sudoku[i + x][j + y];
                            c++;
                        }
                    }
                    if (!Check_num(block_sudoku)) {
                        Value = false;
                    }
                }
            }
            System.out.println("#" + test_case + " " + (Value ? 1 : 0));
        }
    }

    private static boolean Check_num(int[] numbers) {
        boolean[] list = new boolean[10];
        for (int i = 1; i < numbers.length; i++) {
            if (!list[numbers[i]]) {
                list[numbers[i]] = true;
            } else {
                return false;
            }
        }
        return true;
    }
}