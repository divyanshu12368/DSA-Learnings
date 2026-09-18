class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] ans = new int[image.length][image[0].length];
        for(int i = 0; i<image.length; i++){
            int k = image[0].length-1;
            for(int j = 0; j<image[0].length; j++){
                if(image[i][j]==0){
                    ans[i][k] = 1;
                }
                else{
                    ans[i][k] = 0;
                }
                k--;
            }
        }
        return ans;
    }
}