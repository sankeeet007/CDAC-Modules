#include<iostream>
using namespace std;

int sumofdigits(int num){
	if(num==0)
	{
		return 0;
	}
	return (num%10)+sumofdigits(num/10);
}

int main(){
	int no;
	cout<<"Enter a 4 digit number: "<<endl;
	cin>>no;
	cout<<"Sum of digits of: "<<no<<" is "<<sumofdigits(no)<<endl;
	return 0;
}
