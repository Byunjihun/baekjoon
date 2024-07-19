import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
              String answer = "";
        String[] arr = my_string.split("");
        Object[] array = Arrays.stream(arr).distinct().toArray();

        for (Object o : array) {
            answer += o;
        }
        return answer;
    }
}