import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] coinArr = {500,100,50,10,5,1};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cost = Integer.parseInt(br.readLine());

        int change = 1000 - cost;
        int num = 0;

        for (int i=0 ; i<coinArr.length;i++){
            if (change / coinArr[i] > 0){
                num += change/coinArr[i];
                change = change % coinArr[i];
            }
        }
        System.out.println(num);
    }
}