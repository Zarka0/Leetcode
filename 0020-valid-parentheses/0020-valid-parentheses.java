class Solution {
    public boolean isValid(String s) {
     Stack<Character> stack=new Stack<>();
     for(int i=0; i<s.length(); i++){
        if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
            stack.push(s.charAt(i));
        }else{
            char top=stack.peek();
            if((s.charAt(i)=='}' && top=='{') || (s.charAt(i)==']' && top=='[') || (s.charAt(i)==')' && top=='(')){
                stack.pop();
            }
        }
    }
    return stack.isEmpty();
}
}