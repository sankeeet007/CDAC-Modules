#include <iostream>
using namespace std;

int main() {
    char name[50];
    char ch;
    cout<<"enter a character"<<endl;
    cin.get(ch);  // s enter
    cin.ignore();//clears the buffer
    cout<<"Charcater: "<<ch<<endl;
    cout << "Enter name: ";
    //accepts string with spaces, it ends when user press enter 
    cin.getline(name,50);

    cout << "Name: " << name<<endl;

    return 0;
}
