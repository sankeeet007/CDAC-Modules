#include<iostream>
using namespace std;

int sumofdigits(int no)
{	
	int rem;
	int sum=0;
	while(no>0)
	{
		rem = no%10;
		no = no/10;
		sum+=rem;
	}
	return sum;
}

int main(){
	int num;
	int sum;
	cout<<"Enter a 4-digit number: "<<endl;
	cin>>num;
	sum = sumofdigits(num);
	cout<<"Sum of Digits of number: "<<sum<<endl;
	return 0;
}
