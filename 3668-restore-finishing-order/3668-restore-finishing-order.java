class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans = new int[friends.length];
        HashSet<Integer> set = new HashSet<>();

        for(int num:friends){
            set.add(num);
        }
        int i = 0;
        for(int num:order){
            if(set.contains(num)){
                ans[i] = num;
                i++;
            }
        }
        return ans;
    }
}