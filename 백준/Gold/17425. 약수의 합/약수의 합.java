import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int MAX = 1000000;

        long[] f = new long[MAX + 1];
        long[] g = new long[MAX + 1];

        for (int i = 1; i <= MAX; i++) {
            for (int j = i; j <= MAX; j += i) {
                f[j] += i;
            }
        }

        for (int i = 1; i <= MAX; i++) {
            g[i] = g[i - 1] + f[i];
        }

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(g[N]).append("\n");
        }

        System.out.print(sb);
    }
}
