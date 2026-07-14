class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        for(char ch : ch1){
            if(ch != '#'){
                stack.push(ch);
            } else{
                if(stack.isEmpty()) continue;
                stack.pop();
            }
        }
        for(char ch : ch2){
            if(ch != '#'){
                stack2.push(ch);
            }else{
                if(stack2.isEmpty()) continue;
                stack2.pop();
            }
        }
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(char ch : stack){
            s1.append(ch);
        }
        for(char ch: stack2){
            s2.append(ch);
        }
        String ans1 = s1.toString();
        String ans2 = s2.toString();
        if(ans1.equals(ans2)){
            return true;
        }
        else{
            return false;
        }
    }
}