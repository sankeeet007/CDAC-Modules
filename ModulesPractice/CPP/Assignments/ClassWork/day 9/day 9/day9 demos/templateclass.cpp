#include<iostream>
using namespace std;

template<typename T,typename F>
class MyClass{
   private:
	   T x;
	   F y;
   public:
	   MyClass(){
	      x=0;
	      y=0;
	   }
	   MyClass(T a,F b){
	      x=a;
	      y=b;
	   }
	   void display();
	   /*void display(){
	     cout<<"x: "<<x<<"y: "<<y<<endl;
	   }*/


};

template<typename T,typename F>
void MyClass<T,F>::display(){
	     cout<<"x: "<<x<<"y: "<<y<<endl;
}


int main(){
    MyClass<int,float> ob(12,34.5f);
    ob.display();
    MyClass<int,char> ob1(12,'x');
    ob1.display();

}
