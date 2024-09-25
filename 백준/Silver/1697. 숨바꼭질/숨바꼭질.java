import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int K;
    static int[] visit = new int[100001];
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        if (N == K) {
            System.out.println(0);
        } else {
            bfs(N);
        }
    }

    static void bfs(int num) {
        q.add(num);
        visit[num] = 1;

        int[] move = {1, -1, 2};

        while (!q.isEmpty()) {
            int temp = q.poll();

            for (int i = 0; i < 3; i++) {
                int next;

                if (i == 2) {
                    next = temp * move[i];
                } else {
                    next = temp + move[i];
                }

                if (next == K) {
                    System.out.println(visit[temp]);
                    return;
                }

                if (next >= 0 && next < visit.length && visit[next] == 0) {
                    q.add(next);
                    visit[next] = visit[temp] + 1;
                }
            }
        }
    }
}