import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] f = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j += i) {
                f[i] += i;
            }
        }

        long count = 0;

        for (int i = 1; i <= N; i++) {
            count += f[i];
        }
        System.out.println(count);
    }
}