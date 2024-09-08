import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] dist = new int[N - 1];	// 거리
        int[] cost = new int[N];	// 비용 

        // 거리 입력 
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N - 1; i++) {
            dist[i] = Integer.parseInt(st.nextToken());
        }

        // 리터당 기름값 입력
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            cost[i] = Integer.parseInt(st.nextToken());
        }

        long sum = 0;
        long minCost = cost[0];	

        for(int i = 0; i < N - 1; i++) {
            
            if(cost[i] < minCost) {
                minCost = cost[i];
            }

            sum += (minCost * dist[i]);
        }

        System.out.println(sum);

    }
}