
import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] numbers = new int[N+1];
        numbers[0] = 1;
        for (int i=1; i<numbers.length; i++){
            numbers[i] = numbers[i-1] * 2;
        }

        for (int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}