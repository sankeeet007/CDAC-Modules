#include<iostream>
#include "Triangle.h"
using namespace std;

Triangle::Triangle(){
      base=0;
      ht=0;
      s1=0;
      s2=0;
}

Triangle::Triangle(const char* c, int s1,int s2,int b, int h):Shape(c){
   this->s1=s1;
   this->s2=s2;
   base=b;
   ht=h;
}

float Triangle::area(){
   return 0.5f*base*ht;
}

float Triangle::perimeter(){
    return s1+s2+base;
}

Triangle::~Triangle(){
   cout<<"Triangle destructor"<<endl;
}

void Triangle::display(){
	Shape::display();
   cout<<"S1: "<<s1<<" s2:"<<s2<<" base :"<<base<<" height: "<<ht<<endl;
}



