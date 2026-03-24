#include<iostream>
using namespace std;

class A{
   public:
	   A(){
	     cout<<"in A Default constructor"<<endl;
	   }
	   void showA(){
	      cout<<"in show A"<<endl;
	   }

};

class B:virtual public A{
	public:
		B(){
		   cout<<"in B default constructor"<<endl;
		}


};

class C:virtual public A{
  public:
	  C(){
	    cout<<"in c default constructor"<<endl;
	  }

};

class D: public B, public C{
  public:
	  D(){
	    cout<<"in D default constructor"<<endl;
	  }
};

int main(){
     D ob;
   ob.showA();
}



