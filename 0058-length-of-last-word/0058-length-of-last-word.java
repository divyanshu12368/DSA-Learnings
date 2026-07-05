class Solution {
    public int lengthOfLastWord(String s) {
        boolean space = true;
        int count = 0;

        for(int i = s.length()-1; i>=0; i--){
            if(space == false && s.charAt(i)==' '){
                return count;
            }
            else if(space == true && s.charAt(i)==' '){
                continue;
            }
            else{
                count++;
                space = false;
            }
        }
        return count;
    }
}