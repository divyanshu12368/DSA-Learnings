class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> arrList = new ArrayList<>();
        
        Arrays.sort(nums);
        long sum = 0;

        for(int i = 0; i<n; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j = i+1; j<n;){
                
                int p = j+1;
                int q = n-1;
                while(p<q){
                    List<Integer> list = new ArrayList<>();
                    sum = (long) nums[i] + nums[j] + nums[p] + nums[q];
                    if(sum == target){
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[p]);
                        list.add(nums[q]);
                        arrList.add(list);
                        p++;
                        q--;
                        while(p<q && nums[p]==nums[p-1]) p++;
                    } 
                    else if(sum<target) p++;
                    else q--;
                }
                j++;
                while(j<n && nums[j]==nums[j-1]) j++;
            }
        }



        return arrList;
    }
}