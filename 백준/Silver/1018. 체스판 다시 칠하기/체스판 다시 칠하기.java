import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();
        
        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String row = scanner.nextLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = row.charAt(j);
            }
        }
        
        int minRepaint = Integer.MAX_VALUE;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int repaintW = countRepaint(board, i, j, 'W');
                int repaintB = countRepaint(board, i, j, 'B');

                minRepaint = Math.min(minRepaint, repaintW);
                minRepaint = Math.min(minRepaint, repaintB);
            }
        }
        
        System.out.println(minRepaint);
    }
    
    public static int countRepaint(char[][] board, int startX, int startY, char startColor) {
        int repaintCount = 0;
        
        for (int i = startX; i < startX + 8; i++) {
            for (int j = startY; j < startY + 8; j++) {
                if ((i + j - startX - startY) % 2 == 0) {
                    if (board[i][j] != startColor) {
                        repaintCount++;
                    }
                } 
                else {
                    if (board[i][j] == startColor) {
                        repaintCount++;
                    }
                }
            }
        }
        return repaintCount;
    }
}
