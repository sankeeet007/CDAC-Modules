#include<iostream>
#include "date.h"
using namespace std;

int main(){
    Date d1, d2, d3;
    cout<<"Enter Date for D1: "<<endl;
    d1.acceptDate();
    cout<<"Enter Date for D2: "<<endl;
    d2.acceptDate();
    cout<<"For operator+ :  "<<endl;
    d3 = d1+d2;
    d3.displayDate();
    cout<<endl;
    cout<<"For operator- :  "<<endl;
    d3 = d1-d2;
    d3.displayDate();
    cout<<endl;
    cout<<"For operator== :  "<<endl;
    d1==d2;
    cout<<"For operator!= :  "<<endl;
    d1!=d2;
    return 0;
}
