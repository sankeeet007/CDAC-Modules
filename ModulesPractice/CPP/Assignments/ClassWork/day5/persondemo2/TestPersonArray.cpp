#include<iostream>
#include<cstring>
#include "Person.h"
using namespace std;
int count=0;
void acceptData(Person **parr,int size){
       //static int count=0;
   	int pid,a;
	char nm[100];
	cint count=0;
	cout<<"Enter id";
        cin>>pid;
	cout<<"Enter name";
	cin>>nm;
	cout<<"Enter age";
	cin>>a;
        parr[count]=new Person(pid,nm,a);
	count++;

}

void displayData(Person **parr,int size){
   for(int i=0;i<count;i++){
      parr[i]->display();
   }
   //another way
   /*
    *  for(int i=0;i<size;i++){
    *     if(parr[i])
    *       Parr[i]->display();
    *     else
    *       break;
    *  }
    */

}

int main(){
   const int size=100;
   //create a array of Person pointers
   Person **parr=new Person*[size];
   acceptData(parr,size);
   acceptData(parr,size);
   acceptData(parr,size);
   displayData(parr,size);
   delete[] parr;
}
