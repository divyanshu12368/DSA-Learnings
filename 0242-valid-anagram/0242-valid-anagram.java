class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        int[] letters = new int[26];
        int size = s.length();

        for(int i = 0; i<size; i++){
            letters[s.charAt(i)-'a']++;
        }
        for(int i = 0; i<size; i++){
            letters[t.charAt(i)-'a']--;
        }

        for(int c: letters){
            if(c!=0) return false;
        }

        return true;
    }
}