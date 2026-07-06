class Solution {
    public String addBinary(String a, String b) {
       StringBuilder sum = new StringBuilder();
       int carry = 0;
       int i = a.length()-1;
       int j = b.length()-1;

        while(i>=0 && j>=0){
            if(a.charAt(i)=='1'&&b.charAt(j)=='1'){
                if(carry == 0){
                    sum.append('0');
                    carry = 1;
                }
                else{
                    sum.append('1');
                    carry = 1;
                }
            }
            else if(a.charAt(i)=='0'&&b.charAt(j)=='0'){
                if(carry == 0){
                    sum.append('0');
                }
                else{
                    sum.append('1');
                    carry = 0;
                }
            }
            else{
            if(carry == 0){
                    sum.append('1');
                }
                else{
                    sum.append('0');
                    carry = 1;
                } 
            }
            i--;
            j--;
        }
        if(i>j){
            while(i>=0){
                if(carry==0){
                    sum.append(a.charAt(i));
                }
                else{
                    if(a.charAt(i)=='0'){
                        sum.append('1');
                        carry = 0;
                    }
                    else{
                        sum.append('0');
                        carry = 1;
                    }
                }
                i--;
            }
        }
        else if(j>i){
            while(j>=0){
                if(carry==0){
                    sum.append(b.charAt(j));
                }
                else{
                    if(b.charAt(j)=='0'){
                        sum.append('1');
                        carry = 0;
                    }
                    else{
                        sum.append('0');
                        carry = 1;
                    }
                }
                j--;
            } 
        }
        if(carry == 1){
            sum.append('1');
        }
        sum = sum.reverse();
        return sum.toString();
    }
}