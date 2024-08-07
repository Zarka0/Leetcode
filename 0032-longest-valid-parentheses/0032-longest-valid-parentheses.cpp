class Solution {
public:
    int longestValidParentheses(string s) {
        stack<int> stack;
        stack.push(-1);
        int max_len=0;
        for(int i=0; i<s.length(); i++){
            if(s[i]=='('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.empty()){
                    stack.push(i);
                }else{
                    max_len=max(max_len,i-stack.top());
                }
            }
        }
        return max_len;
    }
//without stack
};