#include<iostream>
using namespace std;

int divide(int a,int b){

       int result;
       try{
       if(b==0)
         throw "divide by 0 error";	       
       result=a/b;
       return result;
       }catch(const char *s){
	       cout<<s<<endl;
	       throw s;
       }

}

int main(){
    int a,b,ans;
    try{
    cout<<"enter a and b"<<endl;
    cin>> a>>b;
    ans=divide(a,b);
    cout<<"Division : "<<ans<<endl;
    }catch(const char *s){
        cout<<s<<endl;
    }
    return 0;
}

