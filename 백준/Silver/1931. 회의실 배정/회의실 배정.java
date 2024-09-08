import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] time = new int[N][2];
        for (int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<2; j++){
                time[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(time,(o1, o2) ->
        {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });

        int cnt = 0;
        int start = 0;
        for (int i=0; i<time.length; i++){
            if (start <= time[i][0]){
                start = time[i][1];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}