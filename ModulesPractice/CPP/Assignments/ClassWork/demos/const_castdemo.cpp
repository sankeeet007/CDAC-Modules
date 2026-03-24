#include <iostream>
using namespace std;

void modify(int *p) {
    *p = 50;
}

int main() {
    const int x = 10;
    modify(const_cast<int*>(&x));
    //modify(&x); //error
    cout << x << endl;
}
