import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int sum = 0;
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < 10; j++) {
                int num = Integer.parseInt(str[j]);
                sum += num;
            }
            System.out.println("#" + (i + 1) + " " + Math.round(sum / 10.0));
        }
    }
}
