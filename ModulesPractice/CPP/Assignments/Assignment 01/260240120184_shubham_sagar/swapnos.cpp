#include<iostream>
using namespace std;

void swapnos(int& x, int& y){	//using reference variable
		x = x + y;
		y = x - y;
		x = x - y;	
}
int main(){
	int A, B;
	cout<<"Enter 2 nos: "<<endl;
	cin>>A>>B;
	cout<<"Before Swap A: "<<A<<" B: "<<B<<endl;
	swapnos(A, B);
	cout<<"After Swap A: "<<A<<" B: "<<B<<endl;
	return 0;	
}
