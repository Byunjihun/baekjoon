
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int cal1 = (A + B) % C;
        int cal2 = ((A % C) + (B % C)) % C;
        int cal3 = (A * B) % C;
        int cal4 = ((A % C) * (B % C)) % C;

        System.out.println(cal1);
        System.out.println(cal2);
        System.out.println(cal3);
        System.out.println(cal4);
    }
}