class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int cSum = 0;
        for(int i = 0; i<n; i++){
            cSum += nums[i];
            maxSum = Math.max(maxSum,cSum);
            if(cSum<0){
                cSum = 0;
            }
            
        }
        return maxSum;
    }
}