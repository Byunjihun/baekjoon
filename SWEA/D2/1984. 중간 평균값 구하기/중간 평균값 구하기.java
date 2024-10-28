import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[] list = new int[10];
        for (int test_case = 1; test_case <= T; test_case++) {
            for (int i = 0; i < list.length; i++) {
                list[i] = sc.nextInt();
            }

            Arrays.sort(list);

            int sum = 0;
            for (int i = 1; i < list.length - 1; i++) {
                sum += list[i];
            }
            System.out.println("#" + test_case + " " + Math.round(sum / 8.0f));
        }
    }
}