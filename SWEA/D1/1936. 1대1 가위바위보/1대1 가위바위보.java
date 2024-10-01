
import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int scissors = 1;
        int rock = 2;
        int paper = 3;

        // 가위 바위
        if (A == scissors && B == rock) {
            System.out.println("B");
        }
        // 가위 보
        if (A == scissors && B == paper) {
            System.out.println("A");
        }

        // 바위 가위
        if (A == rock && B == scissors) {
            System.out.println("A");
        }
        // 바위 보
        if (A == rock && B == paper) {
            System.out.println("B");
        }

        // 보 가위
        if (A == paper && B == scissors) {
            System.out.println("B");
        }
        // 보 바위
        if (A == paper && B == rock) {
            System.out.println("A");
        }
    }
}