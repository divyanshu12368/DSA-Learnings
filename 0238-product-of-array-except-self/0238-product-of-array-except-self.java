class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] answer = new int[size];
        int[] prefix = new int[size];
        int[] postfix = new int[size];
        postfix[size-1] = 1;
        prefix[0] = 1;

        for(int i = 1; i<size; i++){
            prefix[i] = prefix[i-1]*nums[i-1];
        }
        for(int j = size-2; j>=0; j--){
            postfix[j] = postfix[j+1]*nums[j+1];
        }
        for(int i = 0; i<size; i++){
            answer[i] = prefix[i]*postfix[i];
        }
        
        return answer;
    }
}