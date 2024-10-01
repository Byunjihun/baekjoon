
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] numbers = new int[N + 1];

        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = i;
        }
        
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}