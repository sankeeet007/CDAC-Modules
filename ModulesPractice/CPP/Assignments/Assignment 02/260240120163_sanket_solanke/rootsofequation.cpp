#include<iostream>
#include<cmath>
using namespace std;

double firstRoot(int a, int b, int c, int res){
	int d = 2*a;
	double first =(double)(-b+sqrt(res))/d;
	return first;
}

double secondRoot(int a, int b, int c, int res){
	int d = 2*a;
	double second =(double)(-b-sqrt(res))/d;
	return second;
}

int main(){
	int a, b, c;
	cout<<"Enter values for a, b, c: "<<endl;
	cin>>a>>b>>c;
	int res = ((b*b)-(4*a*c));
	
	if(res > 0)
	{
		cout<<"Two Real Roots."<<endl;
		cout<< firstRoot(a,b,c,res)<<endl;
		cout<< secondRoot(a,b,c,res)<<endl;
	}
	else if(res == 0)
	{
		cout<<"One Real Roots."<<endl;
		cout<< firstRoot(a,b,c,res)<<endl;
		cout<< secondRoot(a,b,c,res)<<endl;		
	}
	else{
		cout<<"Roots are Complex."<<endl;
	}
	return 0;
}
