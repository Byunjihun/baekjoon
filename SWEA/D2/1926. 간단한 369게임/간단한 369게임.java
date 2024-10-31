import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            String str = Integer.toString(i);

            int clapCount = 0;

            for (char c : str.toCharArray()) {
                if (c == '3' || c == '6' || c == '9') {
                    clapCount++;
                }
            }

            if (clapCount > 0) {
                for (int j = 0; j < clapCount; j++) {
                    sb.append("-");
                }
                sb.append(" ");
            } else {
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
}