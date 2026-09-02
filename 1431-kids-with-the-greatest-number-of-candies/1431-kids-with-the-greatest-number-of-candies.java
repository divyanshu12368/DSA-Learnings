class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int g = 0;
        for(int i = 0; i < candies.length; i++){
            g = Math.max(g,candies[i]);
        }

        for(int i = 0; i < candies.length; i++){
            ans.add(candies[i]+extraCandies>=g?true:false);
        }

        return ans;

    }
}