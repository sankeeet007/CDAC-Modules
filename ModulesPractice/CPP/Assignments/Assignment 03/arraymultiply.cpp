#include<iostream>
using namespace std;

void acceptdata(int *arr, int size){
	cout<<"Enter array elements: "<<endl;
	for(int i=0; i<size; i++){
		cin>>arr[i];
	}
}

void displaydata(int *arr, int size){
	cout<<"[";
	for(int i=0; i<size;i++){
		cout<<arr[i]<<",";
	}
	cout<<"]"<<endl;
}

void arraymultiplication(int *arr, int size){
	for(int i=0;i<size; i++){
		arr[i]=arr[i]*2;
	}
}

int main(){
	int n;
	cout<<"Enter no. of elements: "<<endl;
	cin>>n;
	int arr[n];
	acceptdata(arr, n);
	cout<<"Array elements before multiplication: "<<endl;
	displaydata(arr, n);
	arraymultiplication(arr, n);
	cout<<"\nArray elements after multiplication: "<<endl;
	displaydata(arr, n);
	return 0;
}
