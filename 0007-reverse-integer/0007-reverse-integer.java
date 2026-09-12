class Solution {
    public int reverse(int x) {
        long rev = 0;
        long y = x;
        
        while(y!=0){
            int rem = (int)y%10;
            rev = rev*10 + rem;
            

            y = y/10;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
                return 0;
        }

        return (int)rev;
    }
}