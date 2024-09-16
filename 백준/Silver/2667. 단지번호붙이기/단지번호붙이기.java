import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static Queue<int[]> q = new LinkedList<>();
    static int[] dx = new int[]{-1, 1, 0, 0};
    static int[] dy = new int[]{0, 0, -1, 1};
    static ArrayList<Integer> houseCounts = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    houseCounts.add(bfs(i, j));
                }
            }
        }

        System.out.println(houseCounts.size());
        Collections.sort(houseCounts);
        for (int count : houseCounts) {
            System.out.println(count);
        }
    }

    public static int bfs(int x, int y) {
        int houseCount = 0;
        q.add(new int[]{x, y});
        visited[x][y] = true;

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int nowX = now[0];
            int nowY = now[1];
            houseCount++;

            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= N) {
                    continue;
                }

                if (map[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                    q.add(new int[]{nextX, nextY});
                    visited[nextX][nextY] = true;
                }
            }
        }
        return houseCount;
    }
}
