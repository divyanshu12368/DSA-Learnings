class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = 0;
        for(int i = 0; i<nums.length; i++){
            int color = nums[i];
            if(color == 0){
                red++;
            }
            else if(color == 1){
                white++;
            }
            else{
                blue++;
            }
        }
        int x = 0;

        for(int i = 0; i<red; i++){
            nums[x] = 0;
            x++;
        }
        for(int i = 0; i<white; i++){
            nums[x] = 1;
            x++;
        }
        for(int i = 0; i<blue; i++){
            nums[x] = 2;
            x++;
        }
    }
}