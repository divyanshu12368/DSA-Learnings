class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){

            int num = nums[i];
            ArrayList<Integer> digits = new ArrayList<>();
            while(num!=0){
                digits.add(num%10);
                num = num/10; 
            }
            for(int j = digits.size()-1; j>=0; j--){
                list.add(digits.get(j));
            }

        }

        int[] ans = new int[list.size()];

        for(int i = 0; i<ans.length; i++){
            ans[i] = list.get(i);
        }

        return ans;

    }
}