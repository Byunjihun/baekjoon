import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int t = 1; t <= T; t++) {
            String str1 = sc.nextLine();
            int length = str1.length();
            int patternLength = 0;

            for (int i = 1; i <= Math.min(length / 2, 10); i++) {
                String str2 = str1.substring(0, i);
                String str3 = str1.substring(i, i + i);
                if (str1.length() >= (i + i) && str2.equals(str3)) {
                    patternLength = str2.length();
                    break;
                }
            }

            System.out.println("#" + t + " " + patternLength);
        }
    }
}
