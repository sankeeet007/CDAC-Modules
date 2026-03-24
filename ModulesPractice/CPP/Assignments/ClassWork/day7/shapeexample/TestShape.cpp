#include<iostream>
#include<cstring>
//#include "Shape.h"
#include "Triangle.h"
#include "Circle.h"
using namespace std;

int main(){
   /*Shape s("Red"),s1("Blue"),s2("Yellow");
   s.display();
   s1.display();
   s2.display();

   Triangle t1("Red",7,8,9,5);
   t1.display();
   cout<<"Area: "<<t1.area();
   cout<<"Perimeter: "<<t1.perimeter();*/
   Shape *s;
   s=new Triangle("red",7,8,7,5);
   s->display();
   //calling child specific function
   //Triangle *t=dynamic_cast<Triangle*>(s);
   cout<<"Area: "<<s->area()<<endl;
   cout<<"Perimeter: "<<s->perimeter()<<endl;
   
   delete s;
   s=new Circle("Yellow",4);
   s->display();
   cout<<"area:" <<s->area();
   cout<<"Perimeter :" <<s->perimeter();
   delete s;
   return 0;
}
