class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> occured = new HashSet<>();
        int count = 0;

        for(int i = 0; i<nums.length; i++){
            int x = nums[i];
            if(set.contains(x)&& nums[i-1]!=x){
                if(!occured.contains(x)){
                    count--;
                    occured.add(x);
                }
                continue;
            }
            if(!set.contains(x)){
                count++;
                set.add(x);
            }
        }
        return count;
    }
}