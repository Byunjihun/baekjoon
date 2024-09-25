import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] arr;
    static boolean[][][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visited = new boolean[N][M][2];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        int result = bfs(0, 0);
        System.out.println(result);
    }

    static int bfs(int startX, int startY) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{startX, startY, 0});
        visited[startX][startY][0] = true;

        int steps = 1;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int[] current = q.poll();
                int x = current[0];
                int y = current[1];
                int broken = current[2];

                if (x == N - 1 && y == M - 1) {
                    return steps;
                }

                for (int dir = 0; dir < 4; dir++) {
                    int nx = x + dx[dir];
                    int ny = y + dy[dir];

                    if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                        if (arr[nx][ny] == 0 && !visited[nx][ny][broken]) {
                            q.add(new int[]{nx, ny, broken});
                            visited[nx][ny][broken] = true;
                        }
                        if (arr[nx][ny] == 1 && broken == 0 && !visited[nx][ny][1]) {
                            q.add(new int[]{nx, ny, 1});
                            visited[nx][ny][1] = true;
                        }
                    }
                }
            }
            steps++;
        }

        return -1;
    }
}
