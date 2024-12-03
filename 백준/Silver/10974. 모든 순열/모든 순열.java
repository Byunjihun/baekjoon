import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int[] sequence;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        sequence = new int[N];
        visited = new boolean[N + 1];

        backtrack(0);
    }

    private static void backtrack(int depth) {
        if (depth == N) {
            for (int i = 0; i < N; i++) {
                System.out.print(sequence[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]){
                visited[i] = true;
                sequence[depth] = i;
                backtrack(depth + 1);
                visited[i] = false;
            }
        }
    }
}