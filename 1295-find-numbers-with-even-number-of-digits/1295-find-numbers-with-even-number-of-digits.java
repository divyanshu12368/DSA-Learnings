class Solution {
    public int findNumbers(int[] nums) {
        int eDC = 0;

        for(int i = 0; i<nums.length; i++){
            int num = nums[i];
            int count = (int)Math.log10(num) + 1;

            if(count%2==0){
                eDC++;
            }
        }
        return eDC;
    }
}