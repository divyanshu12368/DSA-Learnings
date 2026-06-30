class Solution {
    public int climbStairs(int n) {
      int count = 0;
      if(n<=2){
        count = n;
        return count;
      }
      else{
        int prev = 2;
        int mprev = 1;
        for(int i = 3; i<=n; i++){
            count = prev + mprev;
            mprev = prev;
            prev = count;
        }
        return count;
      }  
    }
}