#include<iostream>
#include<string>
using namespace std;

int main(){
   string s("abc"),s1("pqr"),s3;
   s3=s1;
   cout<<"enter string"<<endl;
   cin>>s3;
   cout<<"s3: "<<s3<<endl;
   cout<<s1<<","<<s3<<endl;
   cout<<"Concat:"<<s1+s3;
   cout<<"insert string"<<endl;
   s1.insert(2,"xxxxx");
   cout<<"after insertion"<<s1;
   cout<<"Substring : "<<s1.substr(2,5);
}
