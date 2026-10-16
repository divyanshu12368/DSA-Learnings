class Solution {
    public int subarraySum(int[] nums) {
        int n = nums.length;
        int Tsum = 0;
        int start = 0;
        int i = 0;
        while(i<n){
            start = Math.max(0,i-nums[i]);
            int sum = 0;
            while(start<=i){
                sum += nums[start];
                start++;
            }
            Tsum+=sum;
            i++;
        }
        return Tsum;
    }
}