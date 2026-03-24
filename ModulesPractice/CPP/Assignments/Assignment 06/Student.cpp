/*Create Student class and add rollNo and name in it. Create Accept() function which will take
an array of Students as input, but add only one object at a time in the array.(hint: maintain count)
Write one more function to display student data. This Display() function should receive Student
array.*/

#include<iostream>
#include<cstring>
using namespace std;
static int count = 0;

class Student{
    private:
            int rollNo;
            char* name;
    public:
            Student(){
                rollNo = 0;
                name = nullptr;
            }

            Student(int rno, const char* nm){
                rollNo = rno;
                name = new char[strlen(nm)+1];
                strcpy(name, nm);
            }

            void Accept(Student** std, int size){
            	char nm[30];
            	int rno;
		for(int i=0; i<size; i++){
			cout<<"Enter roll number: "<<endl;
			cin>>rno;
			cout<<"Enter name: "<<endl;
			cin>>nm;
			std[i] = new Student(rno, nm);
               } 
            }
            void Display(Student** std, int size){
           	for(int i=0; i<size; i++){
           		cout<<"----------------------------------------"<<endl;
           		cout<<"ID: "<<++count<<endl;
           		cout<<"Name: "<<std[i]->name<<endl;
           		cout<<"Roll Number: "<<std[i]->rollNo<<endl;
           	}
            }
};

int main(){
    int size=3;
    Student** std = new Student*[size]; 
    Student s;
    s.Accept(std, size);
    s.Display(std, size);
    return 0;
}
