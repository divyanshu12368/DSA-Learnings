class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        Arrays.sort(nums);
        
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = nums[0];

        while(i<nums.length){
            if(nums[i]==j) i++;
            else{
                ans.add(j);
            }
            j++;
        }
        return ans;
    }
}