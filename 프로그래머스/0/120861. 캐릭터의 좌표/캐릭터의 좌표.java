class Solution {
    public int[] solution(String[] keyinput, int[] board) {
         int[] answer = {0,0};
        int lenth1 = board[0] / 2;
        int lenth2 = board[1] / 2;

        for (int i=0; i< keyinput.length; i++){
            if (keyinput[i].equals("left")){
                answer[0]--;
                if (answer[0] <= -lenth1){
                    answer[0] = -lenth1;
                }
            }
            if (keyinput[i].equals("right")){
                answer[0]++;
                if (answer[0] >= lenth1){
                    answer[0] = lenth1;
                }
            }
            if (keyinput[i].equals("up")){
                answer[1]++;
                if (answer[1] >= lenth2){
                    answer[1] = lenth2;
                }
            }
            if (keyinput[i].equals("down")){
                answer[1]--;
                if (answer[1] <= -lenth2){
                    answer[1] = -lenth2;
                }
            }
        }
        return answer;
    }
}