#include<iostream>
using namespace std;

int main(){
	int num;
	cout<<"Enter number: "<<endl;
	cin>>num;
	if(num==0)
	{
		cout<<"Given number is 0."<<endl;
	}
	else if (num%2==0){
		cout<<"Given number is Even."<<endl;
	}
	else{
		cout<<"Given number is Odd."<<endl;
	}
	return 0;
}
