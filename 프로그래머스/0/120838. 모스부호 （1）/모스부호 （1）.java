class Solution {
    public String solution(String letter) {
 String answer = "";
        String[] moresList = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};

        String[] morse;
        morse = letter.split(" ");
        for (String string : morse) {
            for (int i=0; i<moresList.length; i++){
                if (string.equals(moresList[i])){
                    answer += Character.toString(i + 'a');
                }
            }
        }

        return answer;
    }
}