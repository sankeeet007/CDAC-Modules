#include "address.h"
#include<iostream>
#include<cstring>
using namespace std;

int main(){
    int size;
    cout<<"Enter size of array:"<<endl;
    cin>>size;
    Address** ad = new Address*[size];
    Address a;
    a.acceptData(ad,size);
    cout<<"----------------------------"<<endl;
    a.displayData(ad, size);
    cout<<"----------------------------"<<endl;
    Address ad1 = *ad[0];
    Address ad2 = *ad[1];
    ad1==ad2;
    return 0;
}