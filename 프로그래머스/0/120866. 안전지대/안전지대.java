class Solution {
    public int solution(int[][] board) {
          int answer = 0;
        int[][] new_board = new int[board.length + 2][board.length + 2];
        for (int i=0; i<board.length; i++){
            for (int j=0; j<board.length; j++){
                if (board[i][j] == 1){
                    for (int a = i; a <= i+2; a++){
                        for (int b = j; b <= j+2; b++){
                                new_board[a][b] = 1;
                        }
                    }
                }
            }
        }

        for(int i = 1;i<new_board.length-1;i++){
            for(int j = 1;j<new_board.length-1;j++){
                if(new_board[i][j] == 0){
                    answer++;
                }
            }
        }

        return answer;    }
}