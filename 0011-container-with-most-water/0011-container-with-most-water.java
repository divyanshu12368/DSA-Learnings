class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0;
        int j = height.length-1;
        while(i<j){
            int width = (j-i);
            int hgt = Math.min(height[i],height[j]);
            int area = width*hgt;
            maxArea = Math.max(maxArea,area);
            if(height[i]<=height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxArea;
    }
}