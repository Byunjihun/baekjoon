class Solution {
    public String solution(String my_string) {
        String[] vowels = {"a", "e", "i", "o", "u"};
        for (String s : vowels) {
            my_string = my_string.replace(s,"");
        }
        return my_string;
    }
}