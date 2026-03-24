#include<iostream>
using namespace std;


enum Coffee {small=1,medium,large};

int main(){
   int choice;
   cout<<"1. small\n 2.medium\n3. large \n choice : "<<endl;
   cin>>choice;
   Coffee c=static_cast<Coffee>(choice);
   switch(c){
     case small:
	     cout<<"you selected small -->"<<c<<endl;
	     break;
     case medium:
	     cout<<"you selected medium--->"<<c<<endl;
	     break;
     case large:
	     cout<<"you selected large--->"<<c<<endl;
	     break;
   } 
   cout<<"end of main"<<endl;
   return 0;
}
