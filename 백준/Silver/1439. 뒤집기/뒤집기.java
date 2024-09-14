import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = new String(br.readLine());
        StringTokenizer str0 = new StringTokenizer(str,"0");
        StringTokenizer str1 = new StringTokenizer(str,"1");
        System.out.println(Math.min(str0.countTokens(), str1.countTokens()));
    }
}