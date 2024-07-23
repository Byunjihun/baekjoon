import java.util.Arrays;

class Solution {
    public String solution(String s) {
       String answer = "";
        int cnt;
        String[] split = s.split("");
        Arrays.sort(split);
        
        for (int i=0; i<split.length; i++){
            cnt = 0;
            for (int j=0; j<split.length; j++){
                if (split[i].equals(split[j])){
                    cnt++;
                }
            }
            if (cnt == 1){
                answer += split[i];
            }
        }
        return answer;
    }
}