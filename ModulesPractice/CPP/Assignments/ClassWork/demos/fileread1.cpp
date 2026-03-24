#include<iostream>
#include<fstream>
#include<string>
using namespace std;

int main(){
   ifstream fin("myfile.txt"),fin1("myfile1.txt");
   string str;
   fin>>str;
   cout<<str<<endl;
   fin>>str;
   cout<<str<<endl;

   while(getline(fin1,str)){
	   cout<<"in loop"<<endl;
           cout<<str<<endl;
   }
   
}
