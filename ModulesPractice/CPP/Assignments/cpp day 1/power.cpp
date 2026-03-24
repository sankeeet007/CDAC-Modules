#include<iostream>
using namespace std;
 
int power(int base, int expo){
	int res=1;
	for(int i=0; i<expo; i++)
	{
		res *= base;
	}
	return res;
}

int main(){
	int base, expo, result;
	cout<<"Enter a base: ";
	cin>>base;
	cout<<"Enter exponent";
	cin>>expo;
	result=power(base, expo);
	cout<<"Power of "<<base<<" ^ "<<expo<<" is: "<<result<<endl;
	return 0;
	}

