
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                list.add(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}