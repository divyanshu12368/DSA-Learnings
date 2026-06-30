class Solution {
    public int trap(int[] height) {
        int left[] = new int[height.length];
        int right[] = new int[height.length];
        int trap = 0;
        int mb;
        //to calculate highest left baar array
        left[0] = height[0];
        for(int i = 1; i<left.length; i++){
            left[i] = Math.max(left[i-1],height[i]);
        }

        //to calculate highest right baar/boundry array
        right[right.length-1] = height[height.length-1];
        for(int i = right.length-2; i>=0; i--){
            right[i] = Math.max(right[i+1],height[i]);
        }

        // to calculate trap water for all bar
        for(int i = 0; i<height.length; i++){
            mb = Math.min(left[i],right[i]);
            trap += mb-height[i];
        }
        return trap;
        
    }
}