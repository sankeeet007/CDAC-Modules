//Reverse string (char array) with recursion
#include<iostream>
#include<cstring>
using namespace std;

void reverseStr(char str[]){
    if(*str == '\0' ){
        return;
    }
    reverseStr(str+1);
    cout<<*str;
}

int main(){
    char str[20];
    cout<<"Enter a string: "<<endl;
    cin>>str;
    //int len = strlen(str);
    reverseStr(str);
    cout<<endl;
    return 0;
}
