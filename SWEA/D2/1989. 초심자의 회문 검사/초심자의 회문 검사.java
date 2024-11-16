import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            String str1 = sc.next();
            String str2 = new StringBuilder(str1).reverse().toString();
            int result = str1.equals(str2) ? 1 : 0;
            System.out.println("#" + test_case + " " + result);
        }
    }
}