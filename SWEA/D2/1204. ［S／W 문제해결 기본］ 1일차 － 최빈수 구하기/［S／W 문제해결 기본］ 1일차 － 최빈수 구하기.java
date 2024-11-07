import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            sc.nextInt();

            int[] scores = new int[1000];
            int[] frequency = new int[101];

            for (int i = 0; i < scores.length; i++) {
                scores[i] = sc.nextInt();
                frequency[scores[i]]++;
            }

            int frequency_num = 0;
            int frequency_idx = 0;

            for (int i = 0; i < frequency.length; i++) {
                if (frequency_num < frequency[i] || frequency_num == frequency[i] && i > frequency_idx) {
                    frequency_num = frequency[i];
                    frequency_idx = i;
                }
            }
            System.out.println("#" + test_case + " " + frequency_idx);
        }
    }
}