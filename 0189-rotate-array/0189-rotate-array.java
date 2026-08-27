class Solution {
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        int[] copyArr = Arrays.copyOf(nums,size);
        
        
        
        if(k>size) k = k%size;
        
        for(int i = 0; i<size; i++){
            
            int x = i+k;
            if(size<=x) x = x - size;
            
            nums[x]=copyArr[i];
        }
    }
}