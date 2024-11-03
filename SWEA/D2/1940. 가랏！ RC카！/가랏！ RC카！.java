import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int t = 1; t <= T; t++) {
            int N = scanner.nextInt();

            int currentSpeed = 0;
            int totalDistance = 0;

            for (int i = 0; i < N; i++) {
                int command = scanner.nextInt();
                int acceleration = 0;

                if (command == 1 || command == 2) {
                    acceleration = scanner.nextInt();
                }

                if (command == 0) {
                    totalDistance += currentSpeed;
                } else if (command == 1) {
                    currentSpeed += acceleration;
                    totalDistance += currentSpeed;
                } else if (command == 2) {
                    currentSpeed -= acceleration;
                    if (currentSpeed < 0) {
                        currentSpeed = 0;
                    }
                    totalDistance += currentSpeed;
                }
            }

            System.out.printf("#%d %d%n", t, totalDistance);
        }

        scanner.close();
    }
}
