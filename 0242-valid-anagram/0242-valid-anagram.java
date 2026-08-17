class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> set = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(set.containsKey(ch)){
                set.put(ch,set.get(ch)+1);
            }
            else{
                set.put(ch,1);
            }
        }
        for(int i = 0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(set.containsKey(ch)){
                if(set.get(ch)!=1){
                    set.put(ch,set.get(ch)-1);
                }
                else{
                    set.remove(ch);
                }
            }
            else{
                return false;
            }
        }
        return true;

    }
}