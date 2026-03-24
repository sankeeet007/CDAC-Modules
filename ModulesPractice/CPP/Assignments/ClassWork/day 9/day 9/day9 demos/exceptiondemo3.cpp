#include <iostream>
#include <stdexcept>
#include<cstring>
using namespace std;

class MyException : public exception {
private:
    char  msg[100];
public:
    MyException(const char *s){
	    strcpy(msg,s);
    }
    const char* what() const noexcept override {
	    return msg;
       // return "This is a user-defined exception!";
    }
};


// Base and Derived classes for bad_cast example
class Base {
    virtual void dummy() {}  // Make Base polymorphic
};

class Derived : public Base {
public:
    void show() { cout << "Derived class" << endl; }
};

int main() {
    try {
        // Divide by zero
        int a = 10, b = 0;
        if (b == 0)
            throw runtime_error("Division by zero!");
        cout << "Result: " << a / b << endl;

    } catch (const runtime_error& e) {
        cout << "Runtime Error: " << e.what() << endl;
    }
try {
        // Code that might throw your custom exception
        throw MyException("Custom exception message");
    }
    catch (const MyException& ex) {
        // Handle the custom exception
        cout << "Caught custom exception: " << ex.what() << endl;
    }
    try {
        // Array index out of bounds
        int arr[3] = {1, 2, 3};
        int index = 5;
        if (index < 0 || index >= 3)
            throw out_of_range("Array index out of bounds!");
        cout << "Value: " << arr[index] << endl;

    } catch (const out_of_range& e) {
        cout << "Out of Range Error: " << e.what() << endl;
    }

    try {
        // Bad cast
        Base* b = new Base();  // Not pointing to Derived
        Derived* d = dynamic_cast<Derived*>(b);
        if (!d)
			//throw "can not convert derived to base";
		    //throw -1;
            throw bad_cast();
        d->show();
        delete b;

    } catch (const bad_cast& e) {
        cout << "Bad Cast Exception: " << e.what() << endl;
    }catch(const char* s){
		cout<<s<<endl;
	}catch(int x){
		cout<<"error: "<<x<<endl;
	}catch(...){  //generalized catch
		cout<<"error occured"<<endl;
		
	}

    return 0;
}

