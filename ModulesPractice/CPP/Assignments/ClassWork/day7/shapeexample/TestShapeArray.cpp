#include<iostream>
#include<cstring>
#include "Triangle.h"
#include "Circle.h"
using namespace std;

int scount=0;
//add new shape at count position
void  addNewShape(int ch,Shape **arr,int size){
        char color[20];
	int s1,s2,b,h,r;
	
	cout<<"enter color"<<endl;
	cin>>color;
	if(ch==1){
	  cout<<"enter s1"<<endl;
	  cin>>s1;
	  cout<<"enter s2"<<endl;
	  cin>>s2;
	  cout<<"enetr base"<<endl;
	  cin>>b;
	  cout<<"enter height"<<endl;
	  cin>>h;
	  arr[scount]=new Triangle(color,s1,s2,b,h);
	  scount++; 
	}else if(ch==2){
	    cout<<"Enter radius"<<endl;
	    cin>>r;
	    arr[scount]=new Circle(color,r);
	    scount++;
         }else if(ch==3){
	    //add code for rectangle
	    cout<<"rectangle";
	 }else{
	    cout<<"wrong choice"<<endl;
	 }


}
void displayAll(Shape** arr,int size){
	for(int i=0;i<scount;i++){
	  arr[i]->display();
	
	}

}
//search shape by id
int searchById(Shape** arr,int size,int id){
   for(int i=0;i<scount;i++){
      if(arr[i]->getId()==id){
         return i;
      }
   }
   return -1;
}
//count differnt types of shapes
void countShapes(Shape** arr,int size){
  int tcnt=0,ccnt=0,rcnt=0;
  for(int i=0;i<scount;i++){
	  //RTTI
     if(dynamic_cast<Triangle*>(arr[i])){
         tcnt++;
     }else if(dynamic_cast<Circle*>(arr[i])){
         ccnt++;
     }else{
         rcnt++;
     }
  
  }


  cout<<"Triangle cnt:"<<tcnt<<endl;
  cout<<"Circle cnt:"<<ccnt<<endl;
  cout<<"Rectangle cnt:"<<rcnt<<endl;
}

//delete th object by id
bool deleteById(Shape **sarr,int size,int id){
int pos=-1;
pos=searchById(sarr,size,id);
if(pos!=-1){
	//release memory of object at pos position
	delete sarr[pos];
	//shifting all rightside object 1 location to left
	for(int i=pos;i<scount-1;i++){
		sarr[i]=sarr[i+1];
	}
	scount--;
	return true;
}
return false;
}

int main(){
  const int size=100;
  Shape *sarr[size];
  int choice=0,ch=0,id,pos;
  bool status;
  do{
     cout<<"1. add Shape\n2. Display all Shapes\n3. count shape\n4. search by id\n5. delete by id\n6. exit\n choice: "<<endl;
     cin>>choice;
     switch(choice){
	     case 1:
		     cout<<"1.Triangle 2.circle 3.rectangle"<<endl;
		     cin>>ch;
		     addNewShape(ch,sarr,size);
		     break;

	     case 2:
		     displayAll(sarr,size);
		     break;
     
	     case 3:
		     countShapes(sarr,size);
		     break;
     
	     case 4:
		     cout<<"Enter id"<<endl;
		     cin>>id;
		     pos=searchById(sarr,size,id);
		     if(pos!=-1){
		       sarr[pos]->display();
		     }else{
		       cout<<"Not found: "<<id<<endl;
		     }
		     break;
	     case 5:
		     cout<<"enter id"<<endl;
		     cin>>id;
		     status=deleteById(sarr,size,id);
		     if(status){
		        cout<<"deleted successfully"<<id<<endl;
		     }else{
		       cout<<"Not found"<<id<<endl;
		     }
		     break;
	     case 6: for(int i=0;i<scount;i++){
		       delete sarr[i];
		     }
		     cout<<"Thank you for visiting...."<<endl;
		     break;
	     default:
		    cout<<"Thank you for visiting...."<<endl; 
		     break;
     }
  }while(choice!=6);
}
