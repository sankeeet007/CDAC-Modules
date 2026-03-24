//Create function for printing an array and call it from main (Student array)
#include<iostream>
#include<cstring>
using namespace std;

void addStudent(char** std, int size){
    for(int i=0; i<size; i++){
        cout<<"Enter "<<i+1<<" Student Name: "<<endl;
        cin>>std[i];
    }
}

void displayStudent(char** std, int size){
    for(int i=0; i<size; i++){
        cout<<std[i]<<endl;
    }
}

int main(){
    int size;
    cout<<"Enter size of array"<<endl;
    cin>>size;
    char** student = new char*[size];
    for(int i=0; i<size; i++){
        student[i] = new char[100];
    }
    addStudent(student, size);
    displayStudent(student, size);
    return 0;
}