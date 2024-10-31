import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int hour1 = sc.nextInt();
            int minute1 = sc.nextInt();

            int hour2 = sc.nextInt();
            int minute2 = sc.nextInt();

            int totalHours = hour1 + hour2;
            int totalMinute = minute1 + minute2;

            if (totalMinute >= 60) {
                totalHours++;
                totalMinute -= 60;
            }

            totalHours = (totalHours - 1) % 12 + 1;

            System.out.println("#" + test_case + " " + totalHours + " " + totalMinute);
        }
    }
}