import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int max = Integer.MIN_VALUE;
            for (int i=0; i<10; i++){
                int num = sc.nextInt();
                if (num > max){
                    max = num;
                }
            }
            System.out.println("#" + test_case + " " + max);
        }
    }
}