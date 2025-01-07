import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] numbers = new int[A];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(numbers);

        System.out.println(numbers[0] * numbers[numbers.length - 1]);
    }
}