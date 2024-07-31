class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = "";
        for (int i=0; i<array.length; i++){
            str += array[i];
        }
        
        String[] split = str.split("");

        for (int i=0; i<split.length; i++){
            if (split[i].equals("7")){
                answer++;
            }
        }
        return answer;
    }
}