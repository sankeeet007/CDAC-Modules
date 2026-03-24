#include<iostream>
#include "Person.h"
using namespace std;

int main(){
   Person p1(12,"Revati",23),p2(p1);
   p1.display();
   p2.display();

}
