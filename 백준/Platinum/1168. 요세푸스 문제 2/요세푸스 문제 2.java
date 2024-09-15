import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        StringBuilder result = new StringBuilder();
        result.append("<");

        int index = 0;

        while (list.size() > 0) {
            index = (index + K - 1) % list.size();
            result.append(list.remove(index));

            if (list.size() > 0) {
                result.append(", ");
            }
        }

        result.append(">");
        System.out.println(result.toString());
    }
}
