import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int R = sc.nextInt();
            int S = sc.nextInt();
            int W = sc.nextInt();

            int A_fee = W * P;

            int B_fee = 0;
            if (W <= R) {
                B_fee = Q;
            } else {
                B_fee = Q + ((W - R) * S);
            }
            System.out.print("#" + test_case + " ");
            System.out.println(Math.min(A_fee, B_fee));
        }
        sc.close();
    }
}