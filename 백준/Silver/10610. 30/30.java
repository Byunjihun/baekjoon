import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        if (!N.contains("0")){
            System.out.println(-1);
            return;
        }

        int sum = 0;

        for (char c : N.toCharArray()) {
            sum += c - '0';
        }

        if (sum % 3 != 0){
            System.out.println(-1);
            return;
        }

        char[] charArray = N.toCharArray();
        Arrays.sort(charArray);

        StringBuilder sb = new StringBuilder(new String(charArray));
        System.out.println(sb.reverse());
    }
}