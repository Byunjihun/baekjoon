import java.util.Arrays;

class Solution {
    public int solution(int order) {
       int answer = 0;
        String[] list = Integer.toString(order).split("");
        System.out.println(Arrays.toString(list));

        for (int i=0; i<list.length; i++){

            if ((Integer.parseInt(list[i]) % 3 == 0) && Integer.parseInt(list[i]) != 0){
                answer++;
            }
        }
        return answer;
    }
}