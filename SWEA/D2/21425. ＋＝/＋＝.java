import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int N = sc.nextInt();

            int cnt = 0;

            while (A <= N && B <= N) {
                if (A < B) {
                    A += B;
                } else {
                    B += A;
                }
                cnt++;
            }

            System.out.println(cnt);
        }
    }
}
