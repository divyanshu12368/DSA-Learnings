class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        char a;

        while(i<s.length()){
            a = s.charAt(i);
            if (!stack.isEmpty() &&
                ((stack.peek() == '(' && a == ')') ||
                (stack.peek() == '{' && a == '}') ||
                (stack.peek() == '[' && a == ']'))) {

                stack.pop();

            } else {
                stack.push(a);
            }
            i++;
            

        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}