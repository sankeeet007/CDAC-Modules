#include<iostream>
#include "Circle.h"
using namespace std;

Circle::Circle(){
    radius=0;
}

Circle::Circle(const char* c,int r):Shape(c){
	radius=r;
   
}
void Circle::display(){
        Shape::display(); 
	cout<<" Radius :"<<radius<<endl;
}

float Circle::area(){
  return 3.142f*radius*radius;
}

float Circle::perimeter(){
    return 3.142f*2*radius;
}

Circle::~Circle(){
   cout<<"Circle destructor"<<endl;
}





