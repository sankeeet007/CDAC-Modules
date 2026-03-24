#include<iostream>
#include<cmath>
using namespace std;

double compundinterest(double P, double R, double N)
{
	double amount;
	amount = P * pow((1+(R/100)),N);
	amount = amount - P;
	return amount;
}

int main(){
	double P, R, N;
	double CI;
	cout<<"Enter Principal amount: "<<endl;
	cin>>P;
	cout<<"Enter Rate of Interest: "<<endl;
	cin>>R;
	cout<<"Enter Number of Years: "<<endl;
	cin>>N;
	CI = compundinterest(P, R, N);
	cout<<"Compound Interest: "<<CI<<endl;
	cout<<"Total Amount: "<<CI+P<<endl;
	return 0;
}
