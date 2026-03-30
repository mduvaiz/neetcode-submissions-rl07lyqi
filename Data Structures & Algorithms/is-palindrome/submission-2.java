public class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder S = new StringBuilder();
        for(int i =0; i<s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                S.append(s.charAt(i));
            }
        }
        String str = S.toString();
        str = str.toLowerCase();
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
}
}