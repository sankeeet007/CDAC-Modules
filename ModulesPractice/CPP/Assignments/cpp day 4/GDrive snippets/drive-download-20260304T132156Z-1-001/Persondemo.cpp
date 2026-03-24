#include<iostream>
#include<cstring>
using namespace std;

class Person{
  private:
	  int pid;
	  char pname[100];
	  int age;
	  char addr[100];
  public:
	  //default constructor
	  Person(){
		  cout<<"in Person default constructor"<<endl;
		 this->pid=0;
		  age=0;
		  pname[0]='\0';
		  addr[0]='\0';
	  }

	  //parameterized Constructor
	  Person(int pid,const char nm[10],int a,const char address[10]){
	     cout<<"In person parametrized constructor"<<endl;
	     this->pid=pid;
	     strcpy(pname,nm);
	     age=a;
	     strcpy(addr,address);
	  }
	  //setter methods (mutators)
	  void setPid(int id){
	     pid=id;
	  }

	  void setPname(const char nm[10]){
	     strcpy(pname,nm);
	  }

	  void setAge(int a){
	     age=a;
	  }

	  void setAddr(const char address[10]){
	     strcpy(addr,address);
	  }
          //getter methods
	  int getPid(){
	     return pid;
	  }

	  char* getPname(){
		  return pname;
	  }

	  int getAge(){
	      return age;
	  }

	  char * getAddr(){
	     return addr;
	  }


          //inline function
	  void display() const{
	      cout<<"PID: "<<pid<<endl;
	      cout<<"Name : " <<pname<<endl;
	      cout<<"Age: "<<age<<endl;
	      cout<<"Address: "<<addr<<endl;
	  }

};


int main(){
  Person p,p1(12,"Kishori",23,"baner");
  Person *p2=new Person(13,"Rajan",22,"Baner");
 p1.display();
 (*p2).display();
  p2->display();
  p.display();

  //display name of p1
  cout<<p1.getPname()<<endl;
  cout<<p1.getPid()<<endl;

}
