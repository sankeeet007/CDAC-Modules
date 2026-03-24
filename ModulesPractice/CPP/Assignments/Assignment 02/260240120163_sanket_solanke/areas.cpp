#include<iostream>
using namespace std;
const double pi = 3.14;

double area_circle(int r){
	double c_area = pi * r * r;
	return c_area;
}

int area_rectangle(int l, int b){
	int r_area = l * b;
	return r_area;
}

int area_square(int s){
	int s_area = s * s;
	return s_area;
}

int main(){

	//Area of circle
	int radius;
	cout<<"Enter radius of a circle: "<<endl;
	cin>>radius;
	cout<<"Area of circle: "<<area_circle(radius)<<endl;
	
	//Area of Rectangle
	int len, bre;
	cout<<"\nEnter Length and Breadth of Rectangle"<<endl;
	cin>>len>>bre;
	cout<<"Area of rectangle: "<<area_rectangle(len, bre)<<endl;
	
	//Area of square 
	int side;
	cout<<"Enter the side of square: "<<endl;
	cin>>side;
	cout<<"Area of square: "<<area_square(side)<<endl;
	return 0;
}
