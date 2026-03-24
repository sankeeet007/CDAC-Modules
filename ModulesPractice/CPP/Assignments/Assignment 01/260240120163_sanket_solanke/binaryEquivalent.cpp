#include<iostream>
using namespace std;

void binary(int no){
	if(no==0)
	{
		return;
	}
	binary(no/2);
	cout<<no%2;
}

int main(){
	int num;
	cout<<"Enter a decimal number: "<<endl;
	cin>>num;
	if(num==0)
	{
		cout<<"0"<<endl;
	}
	binary(num);
	return 0;
}
