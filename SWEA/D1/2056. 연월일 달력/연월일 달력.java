
import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int test_case = 1; test_case <= T; test_case++) {
            String str = sc.next();
            String year = str.substring(0, 4); //2222
            String month = str.substring(4, 6); //02
            String day = str.substring(6, 8); //28

            if (Integer.parseInt(month) > 0 && Integer.parseInt(month) <= 12 && Integer.parseInt(day) <= days[Integer.parseInt(month) - 1]) {
                System.out.println("#" + test_case + " " + year + "/" + month + "/" + day);
            } else {
                System.out.println("#" + test_case + " " + "-1");
            }
        }
    }
}