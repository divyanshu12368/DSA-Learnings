class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        String[] ans = new String[n];
        int[] arr = heights.clone();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n;j++){
                if(arr[i]==heights[j]){
                    ans[i] = names[j];
                    break;
                }
            }
        }

        return ans;
    }
}