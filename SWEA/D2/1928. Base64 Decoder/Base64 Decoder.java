import java.util.Scanner;

public class Solution {
    // Base64 인코딩 테이블
    private static final String BASE64_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        scanner.nextLine();

        for (int t = 1; t <= T; t++) {
            String base64Input = scanner.nextLine();
            String decodedString = decode(base64Input);

            System.out.printf("#%d %s%n", t, decodedString);
        }

        scanner.close();
    }

    private static String decode(String base64Input) {
        StringBuilder decoded = new StringBuilder();

        int length = base64Input.length();

        for (int i = 0; i < length; i += 4) {
            int b1 = BASE64_CHARS.indexOf(base64Input.charAt(i));
            int b2 = BASE64_CHARS.indexOf(base64Input.charAt(i + 1));
            int b3 = BASE64_CHARS.indexOf(base64Input.charAt(i + 2));
            int b4 = BASE64_CHARS.indexOf(base64Input.charAt(i + 3));

            int combined = (b1 << 18) | (b2 << 12) | (b3 << 6) | b4;

            decoded.append((char) ((combined >> 16) & 0xFF));
            decoded.append((char) ((combined >> 8) & 0xFF));
            decoded.append((char) (combined & 0xFF));
        }

        return decoded.toString();
    }
}
