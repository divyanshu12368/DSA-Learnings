class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] answer = new int[size];
        int suffix = 1;
        answer[0] = 1;

        for(int i = 1; i<size; i++){
            answer[i] = answer[i-1]*nums[i-1];
        }
        for(int j = size-1; j>=0; j--){
            answer[j] = suffix*answer[j];
            suffix = suffix*nums[j];
        }
        return answer;
    }
}