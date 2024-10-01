import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - 'A' + 1;
            System.out.print(num + " ");
        }
    }
}