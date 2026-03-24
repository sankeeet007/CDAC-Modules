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
	 virtual void display(){
		  cout<<"P1: "<<p1<<"P2 : "<<p2<<endl;
	  }
};

class Child1:public Parent{
 private:
	 int c1;
 protected:
	 int c2;
 public:
	 Child1(){
	    cout<<"Child default constructor called"<<endl;
	 }
	 Child1(int a,int b,int c1,int c2):Parent(a,b){
	    cout<<"Child parametrized constructor called"<<endl;
	    this->c1=c1;
	    this->c2=c2;
	 }
	  void display(){
		 Parent::display();
		 cout<<"c1:" <<c1<<"c2 :"<<c2;
	 }
	 //only in child1
	 void showChild1(){
	     cout<<"in showChild1"<<endl;
	 }

};

class Child2:public Parent{
   private:
	  int c11;
   public:
	  Child2(){
	    cout<<"in child2 default constructor"<<endl;
	    c11=0;
	  }
	  Child2(int p1,int p2,int c):Parent(p1,p2){
	    cout<<"in Child2 parametrized constructor"<<endl;
	    c11=c;
	  }
	  //only in child2
	  void showChild2(){
	    cout<<"in showchild2"<<endl;
	  }
	  void display(){
	     Parent::display();
	     cout<<"C11: "<<c11<<endl;
	  }
};

//dynamic polymorphism
int main(){
    //Parent *p=NULL;
    int choice=0;
    cout<<"1. Child1\n 2.Child2"<<endl;
    cin>>choice;
    Parent *p=NULL;
    switch(choice){
       case 1:
	       p=new Child1(1,2,3,4);
	      // p->display();
	      p->showChild1();
	       break;
       case 2:
	       p=new Child2(10,20,30);
	       //p->display();
	       p->showChild2();
	       break;


    }
    p->display();
}

/*
//static polymorphism
int main(){

   Child1 ob1(1,2,12,13);
   ob1.display();
   ob1.showParent();
   ob1.showChild1();
   Child2 ob2(10,20,30);
   ob2.display();
   ob2.showParent();
   ob2.showChild2();
  // ob2.showChild1(); //error
}
*/
