class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum ;
        int[] output = new int[2];
        
        for ( int i = 0; i < nums.length; i++){
            for ( int j = 0; j < nums.length; j++){
                sum = nums[i]+nums[j];
                if (j==i){
                    continue;
                }
                else if (sum == target){
                    output[0] = i;
                    output[1] = j;
                    return output;
                }
            }
        }
        return output;
    }
}