class Solution {
    public String convertToTitle(int columnNumber) {
        String ans = "";
        char ch;
        int num = columnNumber;
        while(num>0){
            num--;
            ch = (char)('A'+(num%26));
            ans = ch + ans;
            num=num/26;
        }

        return ans;
    }
}