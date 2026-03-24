//Function for print factorial series with recursive

#include<iostream>
using namespace std;

int factNum(int n){
    if(n==0){
        return 1;
    }
    return n*factNum(n-1);
}
int main(){
    int num;
    cout<<"Enter number: "<<endl;
    cin>>num;
    for(int i=0; i<=num; i++){
        cout<<factNum(i)<<"\t";
    }
    cout<<endl;
    return 0;
}
