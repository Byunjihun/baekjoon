
import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (String i : s.split(" ")) {
            if (i.equals("Z")){
                stack.pop();
            }
            else {
                stack.push(Integer.parseInt(i));
            }
        }

        for (int i : stack){
            answer += i;
        }
        return answer;
    }
}