import java.util.*;

class Solution {
    public String solution(String my_string) {
       String answer = "";
        String[] arr = my_string.split("");
        Object[] array = Arrays.stream(arr).distinct().toArray();
        for (int i=0; i< array.length; i++){
            answer += array[i];
        }
        return answer;
    }
}