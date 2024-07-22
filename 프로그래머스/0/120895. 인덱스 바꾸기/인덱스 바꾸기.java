class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] arr = my_string.split("");
        String answer = "";

        String temp = "";
        temp = arr[num1];
        arr[num1]= arr[num2];
        arr[num2] = temp;

        for (String string : arr) {
            answer += string;
        }

        return answer;
    }
}