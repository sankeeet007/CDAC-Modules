#include "Player.h"
#include<iostream>
#include<cstring>
using namespace std;

int main(){
    int n;
    cout<<"Enter size of player array: "<<endl;
    cin>>n;
    Player** parr = new Player*[n];
    Player p;
    p.acceptData(parr, n);
    cout<<"-------------------------------"<<endl;
    p.displayData(parr,n);
    cout<<"-------------------------------"<<endl;
    p.sortArray(parr, n);
    cout<<"-------------------------------"<<endl;
    p.displayData(parr,n);
    cout<<"-------------------------------"<<endl;
    return 0;
}