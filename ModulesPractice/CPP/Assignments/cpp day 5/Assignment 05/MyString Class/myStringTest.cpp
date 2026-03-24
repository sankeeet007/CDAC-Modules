#include "myString.h"
#include<cstring>
#include<iostream>
using namespace std;

int main(){
    myString ms1("shubham", 7);
    ms1.displayString();
    myString ms2(ms1);
    ms2.displayString();
    return 0;
}