import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int K = sc.nextInt();

        int cnt = 0;
        for (int i=K;i<=P; i++){
            cnt++;
        }
        System.out.println(cnt);
    }
}