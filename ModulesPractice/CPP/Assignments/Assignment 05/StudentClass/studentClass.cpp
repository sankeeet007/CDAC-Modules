#include<iostream>
#include<cstring>
using namespace std;

class Student{
    private: 
        int rollno;
        char name[20];
        char course[20];
    public:
        Student(){          //default constructor
            rollno = 0;
            name[0] = '\0';
            course[0] = '\0';
        }
        Student(int rno,const char* nm,const char* crs){    //parameterized constructor
            rollno = rno;
            strcpy(name, nm);
            strcpy(course, crs);
        }
        void acceptData(){          //accepting data 
                cout<<"Enter roll number: ";
                cin>>rollno;
                cout<<"Enter Name: ";
                cin>>name;
                cout<<"Enter Course: ";
                cin>>course;
        }   
        void displayData(){             //displaying data
            cout<<"Roll number: "<<rollno<<endl;
            cout<<"Enter Name: "<<name<<endl;
            cout<<"Enter Course: "<<course<<endl;
        }
};


int main(){
    int size;
    cout<<"Enter the size of array: "<<endl;
    cin>>size;
    Student s[size];
    //accepting student data in array of objects
    for(int i=0; i<size; i++){
        cout<<"Enter Data For Student "<<i+1<<endl;
        s[i].acceptData();
        cout<<endl;
    }
    
    //displaying student data from array of objects
     for(int i=0; i<size; i++){
        cout<<"Data of Student "<<i+1<<endl;
        s[i].displayData();
        cout<<endl;
    }
    return 0;
}