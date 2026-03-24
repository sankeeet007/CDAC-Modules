#include <iostream>
using namespace std;

enum Color {RED, GREEN, BLUE};

int main() {
    Color c = GREEN;

    switch(c) {
        case RED:
            cout << "Red Color";
            break;
        case GREEN:
            cout << "Green Color";
            break;
        case BLUE:
            cout << "Blue Color";
            break;
    }
}


