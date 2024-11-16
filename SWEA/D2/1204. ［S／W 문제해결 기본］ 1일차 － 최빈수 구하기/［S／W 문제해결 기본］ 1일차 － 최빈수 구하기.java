import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            sc.nextInt();
            int[] score = new int[1000];
            int[] number = new int[101];

            for (int i = 0; i < score.length; i++) {
                score[i] = sc.nextInt();
                number[score[i]]++;
            }

            int max_number = 0;
            int max_number_idx = 0;

            for (int i = 0; i < number.length; i++) {
                if (max_number < number[i] || max_number == number[i] && i > max_number_idx) {
                    max_number = number[i];
                    max_number_idx = i;
                }
            }
            System.out.println("#" + test_case + " " + max_number_idx);
        }
    }
}
