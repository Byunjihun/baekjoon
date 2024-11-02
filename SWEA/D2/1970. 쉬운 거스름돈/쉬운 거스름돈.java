import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        int[] money_list = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int[] list = new int[8];
            String str = new String();
            int N = sc.nextInt();

            for (int i = 0; i < money_list.length; i++) {
                list[i] = N / money_list[i];
                N = N % money_list[i];
            }

            for (int i = 0; i < list.length; i++) {
                str += list[i] + " ";
            }
            System.out.println("#" + test_case);
            System.out.print(str);
            System.out.println();
        }
    }
}