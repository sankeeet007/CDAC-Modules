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


//enum inside class
#include <iostream>
using namespace std;

class Car {
public:
    enum FuelType {PETROL, DIESEL, ELECTRIC};

    FuelType fuel;

    void setFuel(FuelType f) {
        fuel = f;
    }

    void display() {
        cout << "Fuel type value: " << fuel;
    }
};

int main() {
    Car c;
    c.setFuel(Car::DIESEL);
    c.display();
}