#include<iostream>
using namespace std;
class Parent{
  private:
	  int p1;
  protected:
	  int p2;
  public:
	  Parent(){
	    cout<<"default constructor called Parent"<<endl;
	    p1=0;
	    p2=0;
	  }
	  Parent(int p1,int p2){

	    cout<<" parametrized constructor called Parent"<<endl;
	    this->p1=p1;
	    this->p2=p2;
	  }
	  void showParent(){
	     cout<<"Show parent"<<endl;
	  }
	  void display(){
		  cout<<"P1: "<<p1<<"P2 : "<<p2<<endl;
	  }
};

class Child:public Parent{
 private:
	 int c1;
 protected:
	 int c2;
 public:
	 Child(){
	    cout<<"Child default constructor called"<<endl;
	 }
	 Child(int a,int b,int c1,int c2):Parent(a,b){
	    cout<<"Child parametrized constructor called"<<endl;
	    this->c1=c1;
	    this->c2=c2;
	 }
	 void display(){
		 Parent::display();
		 cout<<"c1:" <<c1<<"c2 :"<<c2;
	 }

};

int main(){

   Child c1(1,2,12,13);
   c1.display();
   c1.showParent();
}
