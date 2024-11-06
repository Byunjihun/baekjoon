import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            StringBuilder sb = new StringBuilder();
            int N = sc.nextInt();

            for (int i = 0; i < N; i++) {
                String character = sc.next();
                int count = sc.nextInt();
                for (int j = 0; j < count; j++) {
                    sb.append(character);
                }
            }

            System.out.println("#" + test_case);
            for (int i = 0; i < sb.length(); i += 10) {
                System.out.println(sb.substring(i, Math.min(sb.length(), i + 10)));
            }
        }
    }
}