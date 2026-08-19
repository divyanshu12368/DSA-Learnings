class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Frequency count
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        // bucket list
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int num : map.keySet()){
            int freq = map.get(num);
            if (buckets[freq] == null){
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(num);
        }

        // highest frequency to lowest
        int[] result = new int[k];
        int index = 0;

        for(int freq = nums.length; freq>=1 && index<k; freq--){
            if(buckets[freq]!= null){
                for(int num: buckets[freq]){
                    result[index++] = num;
                    if(index==k){
                        break;
                    }
                }
            }
        }
        return result;

    }
}