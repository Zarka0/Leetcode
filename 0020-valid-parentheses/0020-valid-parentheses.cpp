//Iterate over the characters
//if character is opening bracket then push into stack
//store top of the stack and compare if it is closing bracket or not
//return if stack is empty(valid) or not
class Solution {
public:
    bool isValid(string s) {
     stack<char>  stack;
     for(int i=0; i<s.length(); i++){
        if(s[i]=='(' || s[i]=='{' || s[i]=='['){
            stack.push(s[i]);
        }else{
            if(stack.empty()) return false;
            else{
                char top=stack.top();
                if((s[i] == ')' && top == '(') || (s[i] == '}' && top == '{') || (s[i] == ']' && top == '[')){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }


     }
     return stack.empty();   
    }
};