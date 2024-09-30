import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x < y){
                System.out.println("#" + test_case + " <");
            }
            if (x > y){
                System.out.println("#" + test_case + " >");
            }
            else if (x == y){
                System.out.println("#" + test_case + " =");
            }
        }
    }
}