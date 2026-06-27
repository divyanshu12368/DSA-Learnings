class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int end = nums.length-1;

        for(int i =0; i <= end; i++){
            if (nums[i] == val){
                nums[i] = nums[end];
                i = i-1;
                end = end-1;
                
            }
        }
        count = end +1;
        return count;
    }
}