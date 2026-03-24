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
	   Employee(int num,string nm){
	       id=num;
	       name=nm;
	   }
	   void acceptdata(){
	      cout<<"enter id"<<endl;
	      cin>>id;
	      cout<<"enter name"<<endl;
	      cin>>name;

	   }
	   void display(){
	      cout<<"Id: "<<id<<" Name :"<<name<<endl;
	   }
};

void writeTofile(Employee emparr[3],string& fname){
   ofstream fout(fname,ios::binary|ios::out);
   for(int i=0;i<3;i++){
      cout<<"writing in file"<<endl;
      //writing to the file
      fout.write(reinterpret_cast<char*>(&emparr[i]),sizeof(emparr[i]));
   }
   fout.close();
}

void readfromfile(Employee emparr[3],string& fname){
     ifstream fin(fname,ios::binary|ios::in);
     for(int i=0;i<3;i++){
       fin.read(reinterpret_cast<char*>(&emparr[i]),sizeof(emparr[i]));
     
     }
     fin.close();


}
int main(){
    Employee emparr[3];
    Employee emparr2[3];
    for(int i=0;i<3;i++){
       emparr[i].acceptdata();
    }
    for(int i=0;i<3;i++){
       emparr[i].display();
    }
    string fname="empdata1.dat";
    writeTofile(emparr,fname);
    readfromfile(emparr2,fname);
    cout<<"reading from file: "<<endl;
    for(int i=0;i<3;i++){
       emparr2[i].display();
    }
}

