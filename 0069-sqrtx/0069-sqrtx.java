class Solution {
    public int mySqrt(int x) {
        long sqrt = 1;

        
        while(true){
            if (sqrt*sqrt==x){
                return (int)sqrt;
            }
            else if(sqrt*sqrt>x){
                return (int)sqrt-1;
            }
            else{
                sqrt += 1;
            }
        }
    }
}