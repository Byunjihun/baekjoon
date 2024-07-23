class Solution {
    public int solution(String message) {
        int answer = 0;
        String[] split = message.split("");
        answer = split.length * 2;
        return answer;
    }
}