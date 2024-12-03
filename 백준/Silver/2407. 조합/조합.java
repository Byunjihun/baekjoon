import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        BigInteger numerator = BigInteger.ONE; // 분자
        BigInteger denominator = BigInteger.ONE; // 분모

        for (int i = 0; i < M; i++) {
            numerator = numerator.multiply(BigInteger.valueOf(N - i));
        }
        for (int i = 1; i <= M; i++) {
            denominator = denominator.multiply(BigInteger.valueOf(i));
        }

        BigInteger result = numerator.divide(denominator);

        System.out.println(result);
    }
}
