class Solution {
    public int solution(int age) {
        int answer = 0;
        int year = 2022;
        for (int i = age; i > 1; i--){
            year -=1;
        }
        answer = year;
        return  answer;
    }
}