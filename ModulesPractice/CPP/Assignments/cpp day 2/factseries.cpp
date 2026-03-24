#include<iostream>
using namespace std;

int factorial(int num){
	if(num==1)
	{
		return 1;
	}
	return num*factorial(num-1);
}

int main(){
	int k;
	cout<<"Enter value of K: "<<endl;
	cin>>k;
	if(k==0)
	{
		cout<<"0"<<endl;
	}
	for(int i=1; i<=k; i++)
	{
		cout<<factorial(i)<<endl;
	}
	return 0;
}
