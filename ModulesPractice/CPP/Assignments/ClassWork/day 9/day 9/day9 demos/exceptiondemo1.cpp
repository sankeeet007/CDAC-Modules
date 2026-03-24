#include<iostream>
using namespace std;

int main(){
  double amt;
  for(int i=0;i<3;i++){
  try{
      cout<<"enter withdraw amount"<<endl;
     cin>>amt;
     if(amt>0){
	cout<<"success"<<endl;
     }
     else{
        // cout<<"amount should be > 0"<<endl;
       // throw "amount should be > 0";
       throw amt;	  
     }
     cout<<"outside if"<<endl;
     break;
  }catch(const char *s){
      cout<<s;
  }catch(double a){
      cout<<"Enter positive amount, you entred "<<amt;
  }catch(...){
       cout<<"error occured"<<endl;
     
  }
  }//end of for
  cout<<"outside try catch"<<endl;

}
