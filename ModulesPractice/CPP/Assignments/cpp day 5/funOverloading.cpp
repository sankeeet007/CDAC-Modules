#include<iostream>
using namespace std;

int add(int a,int b){
    return a+b;
}

int add(int a,int b, int c){
    return a+b+c;
}

float add(float a,float b){
    return a+b;
}

double add(double a,double b){
    return a+b;
}

int main(){
    cout<<add(4, 5)<<endl;
    cout<<add(2, 4, 6)<<endl;
    cout<<add(3.5f, 6.6f)<<endl;
    cout<<add(4.5, 5.7)<<endl;
}