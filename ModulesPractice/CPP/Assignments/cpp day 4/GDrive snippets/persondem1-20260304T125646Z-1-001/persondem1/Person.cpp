#include "Person.h"
#include<cstring>
#include<iostream>
using namespace std;

Person::Person(){
   pid=0;
   pname[0]='\0';
   age=0;
   addr[0]='\0';
}

Person::Person(int id,const char* nm,int a,const char * address){
     pid=id;
     strcpy(pname,nm);
     age=a;
     strcpy(addr,address);
}

void Person::display(){
  cout<<"Id: "<<pid<<endl;
  cout<<"Name: "<<pname<<endl;
  cout<<"Age: "<<age<<endl;
  cout<<"Address: "<<addr<<endl;
}



