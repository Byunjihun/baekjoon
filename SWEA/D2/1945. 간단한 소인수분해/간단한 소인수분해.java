import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            long N = sc.nextLong();
            int a_cnt = 0, b_cnt = 0, c_cnt = 0, d_cnt = 0, e_cnt = 0;

            // 각 소수로 나눌 수 있을 때까지 나누고 카운트 증가
            while (N % 2 == 0) {
                a_cnt++;
                N /= 2;
            }
            while (N % 3 == 0) {
                b_cnt++;
                N /= 3;
            }
            while (N % 5 == 0) {
                c_cnt++;
                N /= 5;
            }
            while (N % 7 == 0) {
                d_cnt++;
                N /= 7;
            }
            while (N % 11 == 0) {
                e_cnt++;
                N /= 11;
            }
            
            System.out.println("#" + test_case + " " + a_cnt + " " + b_cnt + " " + c_cnt + " " + d_cnt + " " + e_cnt);
        }
    }
}
