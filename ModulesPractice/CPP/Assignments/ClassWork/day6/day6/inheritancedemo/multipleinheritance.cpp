#include<iostream>
using namespace std;
class Parent1{
  private:
	  int p1;
  protected:
	  int p2;
  public:
	  Parent1(){
	    cout<<"default constructor called Parent"<<endl;
	    p1=0;
	    p2=0;
	  }
	  Parent1(int p1,int p2){

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

class Parent2{
  private:
	  int p21;
  public:
	  Parent2(){
	    cout<<"in Parent2 default constructor"<<endl;
	    p21=0;
	  }
	  Parent2(int p2){
	    cout<<"in Parent2 paremetrized constructor"<<endl;
	    p21=p2;
	  }
	  void display(){
	     cout<<"in parent2 display"<<endl;
	     cout<<p21<<endl;
	  }

};

class Child:public Parent1,public Parent2{
 private:
	 int c1;
 protected:
	 int c2;
 public:
	 Child(){
	    cout<<"Child default constructor called"<<endl;
	 }
	 Child(int a,int b,int c,int c1,int c2):Parent1(a,b),Parent2(c){
	    cout<<"Child parametrized constructor called"<<endl;
	    this->c1=c1;
	    this->c2=c2;
	 }
	 void display(){
		 Parent1::display();
		 Parent2::display();
		 cout<<"c1:" <<c1<<"c2 :"<<c2;
	 }

};

int main(){

   Child c1(1,2,12,13,22);
   c1.display();
   c1.showParent();
}
