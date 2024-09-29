import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N,M,V;
    static int[][] map;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        map = new int[N+1][N+1];
        visit = new boolean[N+1];

        for (int i=1; i<=M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x][y] = map[y][x] = 1;
        }

        dfs(V);
        Arrays.fill(visit,false);
        bfs(V);
        System.out.println(sb);
    }

    static void dfs(int num){
        visit[num] = true;
        sb.append(num).append(" ");

        for (int i=1; i<=N; i++){
            if (map[num][i] == 1 && !visit[i]){
                dfs(i);
            }
        }
    }

    static void bfs(int num){
        visit[num] = true;
        Queue<Integer> q = new LinkedList<>();
        sb.append("\n").append(num).append(" ");
        q.add(num);

        while (!q.isEmpty()){
            int now = q.poll();
            for (int i=1; i<=N; i++){
                if (map[now][i] == 1 && !visit[i]){
                    sb.append(i).append(" ");
                    visit[i] = true;
                    q.add(i);
                }
            }
        }
    }
}