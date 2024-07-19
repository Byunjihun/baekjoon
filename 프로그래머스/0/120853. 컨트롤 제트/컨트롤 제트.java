import java.util.Stack;

class Solution {
    public int solution(String s) {
         Stack<Integer> stack = new Stack<>();
        String[] split = s.split(" ");

        int answer = 0;

        for (int i=0; i<split.length; i++){
            if (split[i].equals("Z")){
                stack.pop();
            }
            else {
                stack.push(Integer.parseInt(split[i]));
            }
        }

        for (int i : stack) {
            answer += i;
        }
        return answer;
    }
}