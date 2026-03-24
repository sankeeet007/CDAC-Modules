#include "Student.h"
#include<iostream>
#include<cstring>
using namespace std;

Student::Student(){
	id=0;
	name[0]='\0';
	address[0]='\0';
	age=0;	
}

Student::Student(int sid, const char* nm, const char* adrs, int a){
	id = sid;
	strcpy(name,nm);
	strcpy(address,adrs);
	age = a;	
}

void Student::display(){
	cout<<"Student Data: "<<endl;
	cout<<"ID: "<<id<<endl;
	cout<<"Name: "<<name<<endl;
	cout<<"Address: "<<address<<endl;
	cout<<"Age: "<<age<<endl;
	
}

