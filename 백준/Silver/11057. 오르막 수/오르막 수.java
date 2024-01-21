import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long mod = 10007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[][] dp = new long[N + 1][10];
        for (int j = 0; j < 10; j++) {
            dp[1][j] = 1;
        }

        for (int i = 2; i <= N; i++) {
            long sum = 0;
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    dp[i][0] = dp[i - 1][0];
                }
                sum = (sum + dp[i - 1][j]) % mod;
                dp[i][j] = sum; // Convert back to int for dp array
            }
        }

        long result = 0;
        for (int j = 0; j < 10; j++) {
            result =  (result + dp[N][j]) %  mod; // Convert back to int for result
        }

        System.out.println(result);
        br.close();
    }
}
