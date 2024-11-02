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
                if (!Check_Duplication(sudoku[i]) || !Check_Duplication(Column_Duplication(sudoku, i))) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                for (int i = 0; i < 9; i += 3) {
                    for (int j = 0; j < 9; j += 3) {
                        if (!Check_Duplication(Block_Duplication(sudoku, i, j))) {
                            isValid = false;
                            break;
                        }
                    }
                }
            }

            System.out.println("#" + test_case + " " + (isValid ? 1 : 0));
        }
        sc.close();
    }

    private static boolean Check_Duplication(int[] sudoku) {
        boolean[] list = new boolean[10];
        for (int num : sudoku) {
            if (list[num]) return false;
            list[num] = true;
        }
        return true;
    }

    private static int[] Column_Duplication(int[][] sudoku, int column) {
        int[] column_list = new int[9];

        for (int i = 0; i < 9; i++) {
            column_list[i] = sudoku[i][column];
        }
        return column_list;
    }

    private static int[] Block_Duplication(int[][] sudoku, int row, int column) {

        int[] list = new int[9];
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list[index++] = sudoku[i + row][j + column];
            }
        }
        return list;
    }
}