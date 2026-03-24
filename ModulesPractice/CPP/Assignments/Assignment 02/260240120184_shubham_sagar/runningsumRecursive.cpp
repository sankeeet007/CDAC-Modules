#include<iostream>
using namespace std;

int sum(int no){
	if(no==1)
	{
		return 1;
	}
	return no+sum(no-1);
}

int main(){
	int n, tot_sum=0;
	int ch;
	do{
	cout<<"Enter the value for n: "<<endl;
	cin>>n;
	
	for(int i=1; i<=n; i++)
	{
		tot_sum += sum(i);	
	}	
	cout<<"Total sum of running numbers is: "<<tot_sum<<endl;
	cout<<"\n1. Do You Want to Continue.\n2.Exit "<<endl;	
	cin>>ch;
	}while(ch==1);
	return 0;
}
