class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2];
        int n = grid.length;
        int a = 0;
        int b = 0;
        int sum = 0;
        int totalSum = (n*n)*((n*n)+1)/2;
        HashSet<Integer> set = new HashSet<>(); 

        for(int i = 0; i<grid.length;i++){
            for(int j = 0; j<grid[0].length; j++){
                set.add(grid[i][j]);
                sum+= grid[i][j];
            }
        }

        int setSum = 0;
        for(int num:set){
            setSum+=num;
        }

        b = totalSum-setSum;
        a = sum + b - totalSum;

        ans[0] = a;
        ans[1] = b;
        return ans;


    }
}