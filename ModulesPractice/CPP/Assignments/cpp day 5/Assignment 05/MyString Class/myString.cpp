#include "myString.h"
#include<iostream>
#include<cstring>
using namespace std;

myString::myString(){
    p = new char;
    *p = '\0';
    size = 0;
}

myString::myString(const char* str, int s){
    p = new char[strlen(str)+1];
    strcpy(p,str);
    size = s;
}

// void myString::acceptString(){
//     cout<<"Enter string: "<<endl;
//     cin>>p;
// }

myString::myString(myString &ms1){         //copy constructor
    this->p=new char[strlen(ms1.p)+1];
    strcpy(this->p,ms1.p);
    size = ms1.size;
}   

void myString::displayString(){
    for(int i=0; i<size; i++){
        cout<<p[i];
    }
    cout<<endl;
}

myString::~myString(){
    if(p){
        delete[] p;
    }
}


