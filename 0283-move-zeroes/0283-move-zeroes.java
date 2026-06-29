class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for(int i = 0; i<nums.length - count; i++){
            if (nums[i]==0){
                count += 1;
                for (int j = i; j<nums.length - 1; j++){
                    nums[j] = nums[j+1];
                }
                nums[nums.length-1] = 0;
                i = i-1;
            }
        }
    }
}