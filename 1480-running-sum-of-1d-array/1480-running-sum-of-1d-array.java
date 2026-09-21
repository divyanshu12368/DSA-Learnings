class Solution {
    public int[] runningSum(int[] nums) {
       int[] ans = new int[nums.length];
       int cs = 0;

       for(int i = 0; i<nums.length; i++){
        cs += nums[i];
        ans[i] = cs;
       }

       return ans;

    }
}