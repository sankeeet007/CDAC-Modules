/*Create Student class and add rollNo and name in it. Create Accept() func-tion which will take
an array of Students as input. Write one more func-tion to display student data. This Display()
function should receive Stu-dent array.
*/

#include<iostream>
#include<cstring>
using namespace std;

class Student{
    public:
        int rollNo;
        string name;
};

void Acceptdata(Student s[], int size){
    cout<<"Enter student details: "<<endl;
    for(int i=0; i<size; i++){
        cout<<"Enter roll no: "<<i+1<<" student"<<endl;
        cin>>s[i].rollNo;
        cout<<"Enter name: "<<i+1<<" student"<<endl;;
        cin>>s[i].name;
    }
    
}

void Displaydata(Student s[], int size){
    for(int i=0; i<size; i++){
        cout<<"Roll no: "<<s[i].rollNo<<endl;
        cout<<"Name: "<<s[i].name<<endl;
    }
}

int main(){
    int size;
    cout<<"Enter size of array: "<<endl;
    cin>>size;
    Student s[size];
    
    Acceptdata(s, size);
    Displaydata(s, size);
    return 0;
}