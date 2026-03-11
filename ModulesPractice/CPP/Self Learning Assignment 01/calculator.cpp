#include <iostream>
using namespace std;

int main() {
    double op1, op2;
    char operation;

    cout << "Enter operand 1: ";
    cin >> op1;
    cout << "Enter operand 2: ";
    cin >> op2;
    cout << "Enter operation (+, -, *, /): ";
    cin >> operation;

    cout << "\nThe result of " << op1 << operation << op2 << " is ";

    switch (operation) {
        case '+': cout << op1 + op2; break;
        case '-': cout << op1 - op2; break;
        case '*': cout << op1 * op2; break;
        case '/': 
            if (op2 != 0) cout << op1 / op2;
            else cout << "Error (Division by zero)";
            break;
        default: cout << "Invalid operator!";
    }
    cout << endl;

    return 0;
}
