import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        String str = br.readLine();
        String[] split = str.split(" ");

        Integer[] num = new Integer[N];
        for (int i=0; i<num.length; i++){
            num[i] = Integer.parseInt(split[i]);
        }

        Arrays.sort(num, Comparator.reverseOrder());

        System.out.println(num[K-1]);
    }
}