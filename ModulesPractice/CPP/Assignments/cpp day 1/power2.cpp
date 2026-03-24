#include<iostream>
using namespace std;

int main(){
	int base;
	int expo;
	int res=1;
	cout<<"Enter base and expo"<<endl;
	cin>>base>>expo;
	for(int i=0; i<expo;i++)
	{
		res = res * base;
	}
	cout<<"Power: "<<res;
	return 0;
}
