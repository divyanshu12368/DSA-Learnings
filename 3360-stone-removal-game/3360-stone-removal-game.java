class Solution {
    public boolean canAliceWin(int n) {
        int i = 10;
        int j = 9;

        while(true){
            if(n<i){
                return false;
            }
            n = n-i;
            i-=2;
            
            if(n<j){
                return true;
            }
            n = n-j;
            j-=2;
        }
    }
}