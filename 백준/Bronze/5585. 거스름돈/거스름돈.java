import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Money = Integer.parseInt(br.readLine());
        int Change = 1000 - Money;
        int[] change_money = new int[]{500,100,50,10,5,1};

        int cnt = 0;
        for (int i=0; i<change_money.length; i++){
            if (Change / change_money[i] > 0){
                cnt += Change / change_money[i];
                Change = Change % change_money[i];
            }
        }
        System.out.println(cnt);
    }
}