class Solution {
    public boolean isPalindrome(String s) {
        String rev="";
        String temp="";
        for(int i=0;i<s.length();i++){
             char c = s.charAt(i);
            if(Character.isLetter(c)||Character.isDigit(c)){
                temp+=c;
            }
        }
        for(int i = s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            if(Character.isLetter(c)||Character.isDigit(c)){
                rev+=c;
            }
        }
        if(temp.equalsIgnoreCase(rev)){
            return true;
        }
        return false;
    }
}
