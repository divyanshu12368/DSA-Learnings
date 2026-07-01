class Solution {
    public String longestCommonPrefix(String[] strs) {
        int k = strs[0].length();
        String lp = "";
        for(int i = 1; i<strs.length; i++){
            k = Math.min(k,strs[i].length());
        }

        for (int i = 0; i<k; i++){
            for (int j =0; j<strs.length-1; j++){
                if(strs[j].charAt(i) != strs[j+1].charAt(i)){
                    return lp;
                }
            }
            lp = lp+strs[0].charAt(i);
        }
        return lp;
    }
}