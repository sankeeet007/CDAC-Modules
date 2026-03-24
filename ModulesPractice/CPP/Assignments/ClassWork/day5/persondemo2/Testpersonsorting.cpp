#include<iostream>
#include<cstring>
#include "Person.h"
using namespace std;
//sort using bubblesort
void sortdata(Person **p,int size){
    for(int i=0;i<size-1;i++){
      for(int j=0;j<size-i-1;j++){
	      //compare name
	      // if(strcmp(p[j]->getPname(), p[j+1]->getPname()) >0)
	      //compare age
          if(p[j]->getAge() > p[j+1]->getAge()){
	    //swap 2 pointer
	    Person *temp=p[j];
	    p[j]=p[j+1];
	    p[j+1]=temp;

	  }


      }
    }

}

void displaydata(Person **p,int size){
     for(int i=0;i<size;i++){
        p[i]->display();
     }
}

int main(){
   Person **p=new Person*[4];
   p[0]=new Person(12,"x",25);
   p[1]=new Person(13,"y",20);
   p[2]=new Person(14,"z",30);
   p[3]=new Person(15,"p",22);
   sortdata(p,4);
   displaydata(p,4);


}

