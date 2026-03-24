#include <iostream>
#include <stack>
#include <string>

using namespace std;

string checkBalance(string expr) {
    stack<char> s;

    for (char ch : expr) {
        // 1. If opening bracket, push to stack
        if (ch == '(' || ch == '[' || ch == '{') {
            s.push(ch);
        } 
        // 2. If closing bracket
        else if (ch == ')' || ch == ']' || ch == '}') {
            // Stack can't be empty, and top must match the type
            if (s.empty()) return "unbalanced parenthesis";
            
            char top = s.top();
            if ((ch == ')' && top == '(') || 
                (ch == ']' && top == '[') || 
                (ch == '}' && top == '{')) {
                s.pop();
            } else {
                return "unbalanced parenthesis";
            }
        }
    }

    // 3. If stack is empty at the end, it's balanced
    return s.empty() ? "balance parenthesis" : "unbalanced parenthesis";
}

int main() {
    string input1 = "(())(()[]{})";
    string input2 = "(())(()[]{}";

    cout << "i/p ---" << input1 << endl;
    cout << " o/p " << checkBalance(input1) << endl;
    cout << "i/p ---" << input2 << endl;
    cout << " o/p " << checkBalance(input2) << endl;

    return 0;
}
