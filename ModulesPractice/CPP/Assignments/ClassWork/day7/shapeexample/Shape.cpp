#include<iostream>
#include "Shape.h"
#include<cstring>
using namespace std;

int Shape::count=0;

Shape::Shape(){
    count++;
    id=count;
   // id=generateId();
    strcpy(color,"White");

}

Shape::Shape(const char* cl){
    count++;
    id=count;
    strcpy(color,cl);
}

void Shape::display(){
    cout<<"Id: "<<id<<" Color: "<<color<<endl;
}

Shape::~Shape(){
   cout<<"in Shape destructor"<<endl;
}


float Shape::area(){
	cout<<"in shape area"<<endl;
   return 0.0f;
}

int Shape::getId(){
    return id;
}
float Shape::perimeter(){
    cout<<"in shape perimeter"<<endl;
    return 0.0f;
}

