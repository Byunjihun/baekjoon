import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            Set<Integer> list = new TreeSet<>();
            int N = sc.nextInt();

            int count = 0;
            int current_num = 0;
            while (list.size() < 10) {
                count++;
                current_num = N * count;

                int temp = current_num;
                while (temp > 0) {
                    list.add(temp % 10);
                    temp = temp / 10;
                }
            }
            System.out.println("#" + test_case + " " + current_num);
        }
    }
}