//Binary Addition
#include<iostream>
using namespace std;
int addBinary(int x, int y){
	while(y!=0){
	int carry = x & y; 	//AND operater gives carry
	x = x ^ y;		//XOR operator gives sum without carry
	y = carry<<1;		//shift carry
	}
	return x;
}

int main(){
	int num1,num2, res;
	cout<<"Enter 2 nos: "<<endl;
	cin>>num1>>num2;
	res = addBinary(num1,num2);
	cout<<"Binary Adddition is: "<<res<<endl;
	return 0;
}
