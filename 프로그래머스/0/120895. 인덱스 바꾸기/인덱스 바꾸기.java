class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String temp = "";
        String[] split = my_string.split("");
        answer = split[num1];
        split[num1] = String.valueOf(my_string.charAt(num2));
        split[num2] = answer;
        for (int i=0; i<split.length; i++){
            temp += split[i];
        }
        return temp;
    }
}