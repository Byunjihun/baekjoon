import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] Month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int test_case = 1; test_case <= T; test_case++) {
            int first_Month = sc.nextInt();
            int first_Day = sc.nextInt();

            int second_Month = sc.nextInt();
            int second_Day = sc.nextInt();

            int sum = 0;
            if (first_Month == second_Month) {
                sum += (second_Day - first_Day) + 1;
            } else {
                sum += Month[first_Month - 1] - (first_Day - 1) + second_Day;
                for (int j = first_Month; j < second_Month - 1; j++) {
                    sum += Month[j];
                }
            }

            System.out.println("#" + test_case + " " + sum);
        }
    }
}