class Solution {
    public int[] solution(String[] keyinput, int[] board) {
       int[] answer = {0,0};
        int a = board[0] / 2;
        int b = board[1] / 2;

        for(int i = 0; i < keyinput.length; i++) {
            if(keyinput[i].equals("left")) {
                answer[0]--;
                if(answer[0] < -a)
                    answer[0] = -a;

            } else if (keyinput[i].equals("right")) {
                answer[0]++;
                if(answer[0] > a)
                    answer[0] = a;

            } else if (keyinput[i].equals("up")) {
                answer[1]++;
                if(answer[1] > b)
                    answer[1] = b;

            } else {
                answer[1]--;
                if(answer[1] < -b)
                    answer[1] = -b;
            }
        }

        return answer;
    }
}