import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 1000000;

        long[] f = new long[max + 1];
        long[] g = new long[max + 1];

        for (int i = 1; i <= max; i++) {
            for (int j = i; j <= max; j += i) {
                f[j] += i;
            }
        }

        for (int i = 1; i <= max; i++) {
            g[i] = g[i - 1] + f[i];
        }

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(g[N]).append("\n");
        }

        System.out.println(sb);
    }
}