import java.util.Scanner;

public class Main {
    static final int MAX_K = 1000;

    static int N, K;
    static int[] lion = new int[MAX_K];

    static int abs(int n) {
        return n < 0 ? -n : n;
    }

    static int min(int a, int b) {
        return a < b ? a : b;
    }

    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static int checkLeftover(int H, int L) {
        int ret = abs(H - L) * 2;

        ret = min(ret, abs(lion[0] - H));
        ret = min(ret, abs(lion[K - 1] - H));

        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans = 0;
        int[] H = { Integer.MAX_VALUE, 0 };
        int[] L = { Integer.MAX_VALUE, 0 };
        
        N = sc.nextInt();
        K = sc.nextInt();

        for (int i = 0; i < K; i++) {
            lion[i] = sc.nextInt();
            L[0] = min(L[0], lion[i]);
            L[1] = max(L[1], lion[i]);
        }

        for (int i = K; i < N; i++) {
            int buf = sc.nextInt();
            H[0] = min(H[0], buf);
            H[1] = max(H[1], buf);
        }

        for (int i = 1; i < K; i++) {
            ans += abs(lion[i] - lion[i - 1]);
        }

        if (H[0] < L[0]) {
            ans += checkLeftover(H[0], L[0]);
        }
        if (H[1] > L[1]) {
            ans += checkLeftover(H[1], L[1]);
        }

        System.out.println(ans);

        sc.close();
    }
}
