#include<iostream>
using namespace std;

void addStudent(int* std, int size){
	cout<<"Enter student Roll numbers: "<<endl;
	for(int i=0; i<size; i++){
		cin>>std[i];
	}
}

void display(int* std, int size){
	for(int i=0; i<size; i++){
		cout<<"Student Roll Number: "<<std[i]<<endl;
	}
}

int main(){
	int size;
	cout<<"Enter size for the array: "<<endl;
	cin>>size;
	int* student= new int[size];
	addStudent(student, size);
	display(student, size);
	return 0;
}
