import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[] pipe = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<pipe.length; i++){
            pipe[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(pipe);
        
        int tape = 0;
        int cnt = 0;
        for (int i=0; i<pipe.length; i++){
            if (tape < pipe[i]){
                tape = pipe[i] + L - 1;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}