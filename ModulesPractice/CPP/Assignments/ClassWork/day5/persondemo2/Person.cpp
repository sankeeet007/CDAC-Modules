#include<iostream>
#include<cstring>
#include "Person.h"
using namespace std;

//default constructor
Person::Person(){
   pid=0;
   //allocate memory to store name
   pname=new char;
   *pname='\0';
   age=0;
}


//parameterised constructor
Person::Person(int id,const char* nm,int a){
      pid=id;
      //allocate spece for name
      pname=new char[strlen(nm)+1];
      strcpy(pname,nm);
      age=a;
}

//copy constructor
Person::Person(Person &p){
   cout<<"Person copy constructor called";
   this->pid=p.pid;
   pname=new char[strlen(p.pname)+1];
   strcpy(pname,p.pname);
   age=p.age;
}

//setter method
inline void Person::setPid(int id){
   this->pid=id;
}

inline void Person::setPname(const char *nm){
    if(pname)
	    delete[] pname;
    pname=new char[strlen(nm)+1];
    strcpy(pname,nm);
}

inline void Person::setAge(int a){
   age=a;
}


///getter methods
int Person::getPid(){
   return pid;
}

inline char * Person::getPname(){
    return pname;
}

int Person::getAge(){
   return age;
}


void Person::display(){
    cout<<"Id: "<<pid<<" Name: "<<pname<<" Age : "<<age<<endl;
}

Person::~Person(){
   if(pname)
	delete[] pname;
}
