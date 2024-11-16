import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            String str1 = sc.next(); //KOREAKOREAKOREAKOREAKOREAKOREA
            int length = str1.length(); // 30
            int patternLength = 0;

            for (int i = 1; i <= Math.min(length / 2, 10); i++) {
                String str2 = str1.substring(0, i);
                String str3 = str1.substring(i, i + i);
                if ( str2.equals(str3)) {
                    patternLength = str2.length();
                    break;
                }
            }

            System.out.println("#" + test_case + " " + patternLength);
        }
    }
}
