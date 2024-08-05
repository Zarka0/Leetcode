class Solution {
public:
    string removeDuplicateLetters(string s) {
        stack<char> stack;
        unordered_map<char, int> freq;//frequency keliye
        unordered_set<char> visited;//to check if char has been visited or not
        // Count frequency of each character
        for (char c : s) {
            freq[c]++;
        }
        for (char c : s) {
            // Decrease the frequency of the current character
            freq[c]--;
            if (visited.find(c) != visited.end()) {
                continue;
            }
            // Maintain  order
            while (!stack.empty() && c < stack.top() && freq[stack.top()] > 0) {
                visited.erase(stack.top());
                stack.pop();
            }
            // Add the current character and mark it as visited
            stack.push(c);
            visited.insert(c);
        }
        string res;
        while (!stack.empty()) {
            res=res+stack.top();
            stack.pop();
        }

        return res;
    }
};
