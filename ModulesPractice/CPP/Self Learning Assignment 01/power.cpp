#include <iostream>
using namespace std;

double power(double n, int p = 2) {
    double result = 1.0;
    
    if (p == 0) 
    	return 1.0;

    for (int i = 1; i <= p; i++) {
        result *= n;
    }
    return result;
}

int main() {
    double num;
    int exp;
    char choice;

    cout << "Enter the base number (n): ";
    cin >> num;

    cout << "Do you want to enter an exponent? (y/n): ";
    cin >> choice;

    if (choice == 'y' || choice == 'Y') {
        cout << "Enter the power (p): ";
        cin >> exp;
        cout << num << "^" << exp << " = " << power(num, exp) << endl;
    } 
    else {
        cout << num << " squared (default) = " << power(num) << endl;
    }

    return 0;
}
