import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt();
            int[] list = new int[N];
            for (int j = 0; j < list.length; j++) {
                list[j] = sc.nextInt();
            }

            long sum = 0;
            int max = 0;

            for (int k = list.length - 1; k >= 0; k--) {
                if (max < list[k]) {
                    max = list[k];
                } else {
                    sum += max - list[k];
                }
            }
            System.out.println("#" + i + " " + sum);
        }
    }
}