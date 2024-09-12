import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int sum = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");

        while (st.hasMoreTokens()){
            StringTokenizer addition = new StringTokenizer(st.nextToken(), "+");
            int temp = 0;
            while (addition.hasMoreTokens()){
                temp += Integer.parseInt(addition.nextToken());
            }
            if (sum == Integer.MAX_VALUE){
                sum  = temp;
            }else {
                sum -= temp;
            }
        }

        System.out.println(sum);
    }
}