#include<iostream>
using namespace std;
class Time{
	private: 
	   int hr,min,sec;
	public: 
	   Time(int h=0,int m=0,int s=0){
	    hr=h;
	    min=m;
	    sec=s;
	   }
	  /* Time(int h=0,int m=0,int s=0):hr(h),min(m),sec(s){
	   }*/
	   Time operator+(const Time t1){
		   Time temp;
		   temp.hr=this->hr+t1.hr;
		   temp.min=this->min+t1.min;
		   temp.sec=this->sec+t1.sec;
		   return temp;
            }
	   Time operator-(Time t1){
		   Time temp;
		   temp.hr=this->hr-t1.hr;
		   temp.min=this->min-t1.min;
		   temp.sec=this->sec-t1.sec;
		   return temp;
	   }
	   void display(){
	     cout<<"Time in hr "<<this->hr<<"\n Time in min "<<this->min<<"\n Time in sec : "<<this->sec<<endl;
	   }
	   friend ostream& operator<<(ostream& out,Time& t1);
	   friend istream& operator>>(istream& in, Time& t1);
};

100 100 100
ostream&  operator<<(ostream& out,Time& t1){
   
	     out<<"Time in hr "<<t1.hr<<"\n Time in min "<<t1.min<<"\n Time in sec : "<<t1.sec<<endl;
           return out;
} 

istream& operator>>(istream& in,Time& t1){
   cout<<"enter hrs";
   in>>t1.hr;
   cout<<"enter mins";
   in>>t1.min;
   cout<<"enter sec";
   in>>t1.sec;
   return in;

}
int main(){
 Time t1(3,4,2);
 Time t2(4,2,1);
 Time t3 ;
 t3=t1+t2;
 cout<<t1;
 cout<<"enetr time";
 cin>>t1;
 t3=t1-t2;
 t3.display();
 return 0;
}
