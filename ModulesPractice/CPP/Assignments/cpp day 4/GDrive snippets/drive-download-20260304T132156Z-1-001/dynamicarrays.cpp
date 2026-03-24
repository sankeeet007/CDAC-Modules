#include<iostream>
#include<cstring>
using namespace std;


int main(){
        char name[20];   //static allocation
	char *addr=new char[10];  //dynamic memory allocation
	cout<<"enter name";
        cin>>name;
	cout<<"enter Address";
	cin>>addr;
	cout<<"Display data"<<endl;
	cout<<"Name: "<<name<<"Length : "<<strlen(name)<<endl;
	cout<<"Address: "<<addr<<"Length: "<<strlen(addr)<<endl;
	cout<<"Compare string "<<strcmp(name,"Kishori");
        if(strcmp(name,"Kishori")==0){
	  cout<<"Equal"<<endl;
	}else{
	  cout<<"Not equal"<<endl;
	}
	strcat(name,"xxxx");
	char * data=new char[strlen(name)+strlen(addr)+1];
	strcat(data,name);
	strcat(data,addr);
	cout<<"Data:"<<data;
	if(addr!=NULL)
	    delete[] addr;
	return 0;

}
