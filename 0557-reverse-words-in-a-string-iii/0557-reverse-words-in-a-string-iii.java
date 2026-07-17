class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder newS = new StringBuilder();

        for(int i = 0; i<arr.length; i++){

            StringBuilder sb = new StringBuilder(arr[i]);
            sb.reverse();
            newS.append(sb);
            if(i<arr.length-1){
                newS.append(" ");
            }
        }
        return newS.toString();
    }
}