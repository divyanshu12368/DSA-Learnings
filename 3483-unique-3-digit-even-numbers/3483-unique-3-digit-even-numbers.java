class Solution {
    public int totalNumbers(int[] digits) {

        int[] freq = new int[10];
        for(int num:digits){
            freq[num]++;
        }

        int count = 0;

        for(int i = 1; i<10; i++){
            if(freq[i]==0) continue;
            freq[i]--;
            for(int j = 0; j<10; j++){
                if (freq[j] == 0) continue;
                freq[j]--;
                for(int k = 0; k<=8; k +=2){
                    if (freq[k] > 0){
                        count++;
                    }
                }
                freq[j]++;
            }
            freq[i]++;
        }
        return count;
    }
}