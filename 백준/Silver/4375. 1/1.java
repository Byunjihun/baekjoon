import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while ((input = br.readLine()) != null && !input.isEmpty()) {
            int n = Integer.parseInt(input); 
            int num = 1;
            int count = 1;
        
            while (num % n != 0) {
                num = (num * 10 + 1) % n;
                count++;
            }

            System.out.println(count);
        }
    }
}
