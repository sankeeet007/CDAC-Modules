//Create function for printing an array and call it from main (Student array)

#include<iostream>
using namespace std;
void addStudent(int* std, int n){
	cout<<"Enter Roll numbers: "<<endl;
	for(int i=0; i<n; i++){
		cin>>std[i];
	}
}

void display(int* std, int n){
	for(int i=0; i<n; i++){
		cout<<"Student Id: "<<std[i]<<endl;
	}
}

int main(){
	int size;
	cout<<"Enter size for the array: "<<endl;
	cin>>size;
	int student[size];
	addStudent(student, size);
	display(student, size);
	return 0;
}
