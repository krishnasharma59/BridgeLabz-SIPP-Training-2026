class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch != '*'){
                stack.push(ch);
            }
            else{
                stack.pop();
            }
        }
        StringBuilder ans = new StringBuilder();
        for(char ch : stack){
            ans.append(ch);
        }
        String sc = ans.toString();
        return sc;
    }
}