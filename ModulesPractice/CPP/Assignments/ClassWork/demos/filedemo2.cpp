#include<iostream>
#include<fstream>
#include<string>
using namespace std;


class Employee{
  private:
	  int id;
	  string name;
  public:
	  Employee(){
	    id=0;
	    name="";
	  }
	  Employee(int id, string nm){
	     this->id=id;
	     name=nm;
	  }
int getId(){
  return id;
}
string getName(){
   return name;
  
}
	  void display(){
	     cout<<"Id: "<<id<<" Name : "<<name<<endl;
	  }
};
int main(){
	string str;
	Employee emp(12,"Rajan"),emp1(13,"Revati");
	//open file in append mode
	//ofstream fout("empdata.dat",ios::app);
	ofstream fout("empdata.dat");
        fout<<emp.getId()<<" "<<emp.getName()+"\n";
	fout<<emp1.getId()<<" "<<emp1.getName()+"\n";
	fout.close();
        ifstream fin("empdata.dat");
	while(getline(fin,str)){
	   cout<<str<<endl;
	}

}
