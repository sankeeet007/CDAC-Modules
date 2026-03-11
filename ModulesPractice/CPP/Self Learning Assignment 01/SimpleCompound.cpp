#include <iostream>
#include <cmath> 

using namespace std;

double calculateSimpleInterest(double p, double r, double t) {
    return (p * r * t) / 100.0;
}

double calculateCompoundInterest(double p, double r, double t) {
    double amount = p * pow((1 + r / 100.0), t);
    return amount - p;
}

int main() {
    double principal, rate, time;

    cout << "Enter Principal Amount: ";
    cin >> principal;
    cout << "Enter Interest Rate (%): ";
    cin >> rate;
    cout << "Enter Time (Years): ";
    cin >> time;

    double si = calculateSimpleInterest(principal, rate, time);
    double ci = calculateCompoundInterest(principal, rate, time);

    cout << "\n--- Results ---" << endl;
    cout << "Simple Interest:   " << si << endl;
    cout << "Compound Interest: " << ci << endl;

    return 0;
}
