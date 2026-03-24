#include<iostream>
using namespace std;

int main(){
	char ch;
	cout<<"Enter any character: "<<endl;
	cin>>ch;
	if((ch>=65) && (ch<=90))
	{
		cout<<"The char is UpperCase."<<endl;
	}
	else if((ch>=97) && (ch<=122))
	{
		cout<<"The char is LowerCase."<<endl;
	}
	else{
		cout<<"Invalid Input!!!"<<endl;
	}
	return 0;
}
