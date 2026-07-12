class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }

        StringBuilder newS = new StringBuilder("");
        s = s.toLowerCase();

        for(int i = 0; i<s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                newS.append(s.charAt(i));
            }
            else{
                continue;
            }
        }
        s = newS.toString();

        if(s.equals(newS.reverse().toString())){
            return true;
        }
        else{
            return false;
        }
    }
}