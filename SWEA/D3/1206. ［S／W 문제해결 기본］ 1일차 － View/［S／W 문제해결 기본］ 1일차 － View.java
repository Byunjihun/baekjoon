import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int test_case = 1; test_case <= 10; test_case++) {
            int N = sc.nextInt();
            int[] height = new int[N];

            for (int i = 0; i < height.length; i++) {
                height[i] = sc.nextInt();
            }

            int sum = 0;
            for (int i = 2; i < N; i++) {
                if (height[i] != 0) {
                    int max = Math.max(
                            Math.max(height[i - 2], height[i - 1]),
                            Math.max(height[i + 1], height[i + 2])
                    );

                    if (height[i] > max) {
                        sum += height[i] - max;
                    }
                }
            }
            System.out.println("#" + test_case + " " + sum);
        }
        sc.close();
    }
}