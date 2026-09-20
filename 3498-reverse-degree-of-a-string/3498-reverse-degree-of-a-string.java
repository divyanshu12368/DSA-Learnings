class Solution {
    public int reverseDegree(String s) {
        int sum = 0;

        for(int i = 0; s.length()>i; i++){
            int x = s.charAt(i);
            x = 26-(x-97);
            x = x*(i+1);
            sum+=x;
        }

        return sum;
    }
}