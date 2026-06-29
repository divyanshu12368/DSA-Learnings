class Solution {
    public int searchInsert(int[] nums, int target) {
        boolean inserted = false;
        int insert = 0;

        for(int i = 0; i<nums.length; i++){
            if (nums[i]>=target){
                insert = i;
                inserted = true;
                return insert;
            }
            else{
                continue;
            }
        }
        insert = nums.length;
        return insert;
        
    }
}