class Solution {
    public long countCommas(long n) {
        if(n<1000){
            return 0;
        }
        long count = 0;
        long divisior = 1000;
        while(n>=divisior){
            count += n - divisior +1;
            divisior *= 1000;
        }

        return count;
        
    }
}