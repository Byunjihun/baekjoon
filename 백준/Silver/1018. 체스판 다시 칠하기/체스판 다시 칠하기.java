import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // N과 M 입력 받기
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리
        
        // 보드 입력 받기
        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String row = scanner.nextLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = row.charAt(j);
            }
        }
        
        // 최소 다시 칠해야 하는 정사각형의 개수 초기화
        int minRepaint = Integer.MAX_VALUE;

        // 보드를 8x8 체스판으로 자르는 모든 경우 고려
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                // 첫 번째 칸이 W로 시작하는 경우와 B로 시작하는 경우를 나누어서 색칠해보기
                int repaintW = countRepaint(board, i, j, 'W');
                int repaintB = countRepaint(board, i, j, 'B');

                // 최소 다시 칠해야 하는 정사각형의 개수 업데이트
                minRepaint = Math.min(minRepaint, repaintW);
                minRepaint = Math.min(minRepaint, repaintB);
            }
        }
        
        // 결과 출력
        System.out.println(minRepaint);
    }
    
    // 색칠해야 하는 정사각형의 개수를 세는 메소드
    public static int countRepaint(char[][] board, int startX, int startY, char startColor) {
        int repaintCount = 0;
        
        for (int i = startX; i < startX + 8; i++) {
            for (int j = startY; j < startY + 8; j++) {
                // W로 시작하는 체스판과 비교
                if ((i + j - startX - startY) % 2 == 0) {
                    if (board[i][j] != startColor) {
                        repaintCount++;
                    }
                } 
                // B로 시작하는 체스판과 비교
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
