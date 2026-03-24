#include<iostream>
using namespace std;
int add(int x,int y){
  return x+y;
}

int add(int x,int y,int z){
	return x+y+z;
    
}
double add(double d,double f){
   cout<<"add double called"<<endl;
   return d+f;
}

float add(float x,float y){
	cout<< "Add float called"<<endl;
   return x+y;
}

int main(){
	
   cout<<add(10,20)<<endl;
   cout<<add(1,4,5)<<endl;
   cout<<add(3.5,45.6)<<endl;
   cout<<add(23.4f,10.5f)<<endl;
}
