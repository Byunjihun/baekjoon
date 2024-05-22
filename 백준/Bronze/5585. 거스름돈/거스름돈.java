import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] coins = {500,100,50,10,5,1};
        int money = Integer.parseInt(br.readLine());
        int change = 1000-money;
        int count = 0;

        for (int i=0; i<coins.length; i++){
            if (change / coins[i] > 0){
                count += change / coins[i];
                change = change % coins[i];
            }
        }
        System.out.println(count);
    }
}