
#include <iostream>
using namespace std;

int main() {
    int x = 65;

    int *p = &x;

    char *ch = reinterpret_cast<char*>(p);

    cout << *ch << endl;
}

