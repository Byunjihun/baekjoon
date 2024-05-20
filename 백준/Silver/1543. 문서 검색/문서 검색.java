import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S1 = br.readLine();
        String S2 = br.readLine();

        int S1_size = S1.length();
        int S2_size = S2.length();

        S1 = S1.replace(S2,"");
        System.out.println((S1_size - S1.length())/S2_size);
    }
}