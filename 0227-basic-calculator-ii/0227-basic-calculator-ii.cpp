class Solution {
private:
    int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }

    void evaluate(stack<int>& operands, stack<char>& operators) {
        int b = operands.top();
        operands.pop();
        int a = operands.top();
        operands.pop();
        char op = operators.top();
        operators.pop();

        int result = 0;
        switch(op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': result = a / b; break;
        }
        operands.push(result);
    }

public:
    int calculate(string s) {
        stack<int> operands;
        stack<char> operators;
        int n = s.size();
        for (int i = 0; i < n; i++) {
            char c = s[i];
            if (c == ' ') continue; // Skip spaces

            if (isdigit(c)) {
                int num = 0;
                while (i < n && isdigit(s[i])) {
                    num = num * 10 + (s[i] - '0');
                    i++;
                }
                i--; // Adjust index as we might have moved one step extra
                operands.push(num);
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!operators.empty() && precedence(operators.top()) >= precedence(c)) {
                    evaluate(operands, operators);
                }
                operators.push(c);
            }
        }

        // Evaluate any remaining operators in the stack
        while (!operators.empty()) {
            evaluate(operands, operators);
        }

        return operands.top();
    }
};
