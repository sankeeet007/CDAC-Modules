#include <iostream>
using namespace std;

// 1. Function to check if a number is Prime
void checkPrime(int n) {
    if (n <= 1) {
        cout << n << " is not a prime number." << endl;
        return;
    }
    bool isPrime = true;
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            isPrime = false;
            break;
        }
    }
    if (isPrime)
        cout << n << " is a prime number." << endl;
    else
        cout << n << " is not a prime number." << endl;
}

// 2. Function to check Odd or Even
void checkOddEven(int n) {
    if (n % 2 == 0)
        cout << n << " is Even." << endl;
    else
        cout << n << " is Odd." << endl;
}

// 3. Function to check Positive or Negative
void checkPositiveNegative(int n) {
    if (n > 0)
        cout << n << " is Positive." << endl;
    else if (n < 0)
        cout << n << " is Negative." << endl;
    else
        cout << "The number is Zero." << endl;
}

int main() {
    int num, choice;

    cout << "Enter a number to perform operations on: ";
    cin >> num;

    do {
        cout << "\n--- Menu Driven Program ---" << endl;
        cout << "1. Prime number or not" << endl;
        cout << "2. Odd or Even" << endl;
        cout << "3. Positive or Negative" << endl;
        cout << "4. Exit" << endl;
        cout << "Enter your choice (1-4): ";
        cin >> choice;

        switch (choice) {
            case 1:
                checkPrime(num);
                break;
            case 2:
                checkOddEven(num);
                break;
            case 3:
                checkPositiveNegative(num);
                break;
            case 4:
                cout << "Exiting program..." << endl;
                break;
            default:
                cout << "Invalid choice! Please try again." << endl;
        }
    } while (choice != 4);

    return 0;
}
