import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer[] day = new Integer[N];
        for (int i=0; i<day.length; i++){
            day[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(day, Comparator.reverseOrder());

        int max = 0;
        for (int i=0; i<N; i++){
            if (max <= (i+1) + day[i]){
                max = (i+1) + day[i];
            }
        }
        System.out.println(max + 1);
    }
}