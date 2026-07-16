class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i<nums1.length; i++){
            int x = nums1[i];
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else{
                map.put(x,1);
            }
        }
        for(int i = 0; i<nums2.length; i++){
            int x = nums2[i];
            if(map.containsKey(x) && map.get(x)>=1){
                map.put(x,map.get(x)-1);
                ans.add(x);
            }
        }
        int arr[] = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }
}