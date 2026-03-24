#include<iostream>
using namespace std;

class Base {
public:
    void show() { 
    cout << "Base class\n"; 
    }
};

class Derived : public Base {
public:
    void display() { 
    cout << "Derived class\n"; 
    }
};

int main() {
    Base *b = new Derived();
    Derived *d = static_cast<Derived*>(b);
    d->display();
}
