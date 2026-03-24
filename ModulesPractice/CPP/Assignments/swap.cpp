#include<iostream>
using namespace std;

void swap(int &n1, int &n2){
	int tmp = n1;
	n1=n2;
	n2=tmp;
}

int main(){
	int num1, num2;
	cout<<"****** Declare function and call it by reference for swapping numbers ******"<<endl;
	cout<<"Enter 2 nos:"<<endl;
	cin>>num1>>num2;
	cout<<"Before swap: "<<endl;
	cout<<"Num1: "<<num1<<" Num2: "<<num2<<endl;	
	swap(num1, num2);
	cout<<"After swap: "<<endl;
	cout<<"Num1: "<<num1<<" Num2: "<<num2<<endl;
	return 0;
}
