#include<iostream>
using namespace std;

int fibonacci(int num){
	if(num==0)
	{
		return 0;
	}
	else if(num==1)
	{
		return 1;
	}
	else{
	return fibonacci(num-1) + fibonacci(num-2);
	}
}

int main(){
	int n;
	cout<<"Enter a number: "<<endl;
	cin>>n;
	cout<<"Fibonacci Series is: "<<endl;
	for(int i=0; i<n; i++)
	{	
		cout<<fibonacci(i)<<"\t";
	}
	return 0;
}


