#include<iostream>
using namespace std;

int areaRect(int len, int brd){
	return len*brd;	
}

int main(){
	int l, b;
	cout<<"Enter length and breadth in cm: "<<endl;
	cin>>l>>b;
	cout<<"Area of rectangle is: "<<areaRect(l, b)<<"cm^2"<<endl;
	return 0;
}
