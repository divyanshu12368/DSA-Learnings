class Solution {
    public int[] sortedSquares(int[] nums) {
        int length = nums.length;
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }

        int arr[] = new int[length];

        int i = 0;
        int k = length-1;
        int j = length-1;
        while(i<=j){
            int x= nums[i];
            int y= nums[j];
            if(x>y){
                arr[k] = x;
                i++;
            }
            else{
                arr[k] = y;
                j--;
            }
            k--;
        }
        return arr;
    }
}