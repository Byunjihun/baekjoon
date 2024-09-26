import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int M, N, H;
    static int[][][] map;
    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        map = new int[H][N][M];
        Queue<int[]> q = new LinkedList<>();
        int unripeCount = 0;

        for (int z = 0; z < H; z++) {
            for (int y = 0; y < N; y++) {
                st = new StringTokenizer(br.readLine());
                for (int x = 0; x < M; x++) {
                    map[z][y][x] = Integer.parseInt(st.nextToken());

                    if (map[z][y][x] == 1) {
                        q.add(new int[]{z, y, x});
                    }

                    else if (map[z][y][x] == 0) {
                        unripeCount++;
                    }
                }
            }
        }

        if (unripeCount == 0) {
            System.out.println(0);
            return;
        }

        int days = bfs(q);

        if (checkUnripeTomatoes()) {
            System.out.println(-1);
        } else {
            System.out.println(days);
        }
    }

    static int bfs(Queue<int[]> queue) {
        int days = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean ripened = false;

            for (int i = 0; i < size; i++) {
                int[] now = queue.poll();
                int nowZ = now[0];
                int nowY = now[1];
                int nowX = now[2];

                for (int j = 0; j < 6; j++) {
                    int nextZ = nowZ + dz[j];
                    int nextY = nowY + dy[j];
                    int nextX = nowX + dx[j];

                    if (nextZ >= 0 && nextY >= 0 && nextX >= 0 && nextZ < H && nextY < N && nextX < M) {
                        if (map[nextZ][nextY][nextX] == 0) {
                            map[nextZ][nextY][nextX] = 1;
                            queue.add(new int[]{nextZ, nextY, nextX});
                            ripened = true;
                        }
                    }
                }
            }

            if (ripened) {
                days++;
            }
        }

        return days;
    }

    static boolean checkUnripeTomatoes() {
        for (int z = 0; z < H; z++) {
            for (int y = 0; y < N; y++) {
                for (int x = 0; x < M; x++) {
                    if (map[z][y][x] == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
