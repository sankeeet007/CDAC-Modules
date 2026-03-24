#include<iostream>
using namespace std;
class Base {
public:
    virtual void show() {}
};

class Derived : public Base {
public:
    void display() {
        cout << "Derived class function\n";
    }
};

int main(){

Base *b = new Base();
Base *b1=new Derived();

Derived *d = dynamic_cast<Derived*>(b);

if(d == NULL)
    cout << "Cast failed";
Derived *d2=dynamic_cast<Derived *>(b1);
if(d2!=NULL){
   cout<<"Done"<<endl;
}else{
   cout<<"Fail"<<endl;
}

}




