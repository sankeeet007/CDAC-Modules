#include<iostream>
#include<cstring>
using namespace std;

int main(){
	char name[40];		//Static allocation of array
	char* address = new char[50];	//Dynamic allocation of array
	cout<<"Enter name: "<<endl;
	cin>>name;
	cout<<"Enter Address: "<<endl;
	cin>>address;
	cout<<"\nDisplay Data: "<<endl;
	cout<<"Name:  "<<name<<" Length:  "<<strlen(name)<<endl;
	cout<<"Address:  "<<address<<" Length:  "<<strlen(address)<<endl;

	cout<<"\nComparing String Data: "<<endl;
//	bool compare = strcmp(name, "Sanket");
//	cout<<compare;
	
	if(strcmp(name, "Sanket")==0){
		cout<<"Equal"<<endl;
	}
	else{
		cout<<"NOT Equal"<<endl;
	}
	char* data = new char[strlen(name)+strlen(address)+1];
	strcat(data, name);
	strcat(data, address);
	cout<<"Concat String is: "<<data<<endl;
	
	return 0;	
	
}
