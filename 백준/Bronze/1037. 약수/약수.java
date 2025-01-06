import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        int[] number = new int[A];

        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(number);

        int cal = (number[number.length - 1] * number[0]);
        System.out.println(cal);
    }
}