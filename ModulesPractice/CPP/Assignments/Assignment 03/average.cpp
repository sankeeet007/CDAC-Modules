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
	for(int i=0; i<size; i++){
		cout<<arr[i]<<",";
	}
	cout<<"]"<<endl;
}
int average(int *arr, int size){
	int avg=0;
	for(int i=0; i<size; i++){
		avg=(arr[0]+arr[size-1])/2;
	}
	return avg;
}
int main(){
	int n;
	cout<<"Enter total no. of elements: "<<endl;
	cin>>n;
	int arr[n];
	acceptdata(arr, n);
	displaydata(arr, n);
	cout<<"Average of all elements is: "<<average(arr, n)<<endl;
	return 0;
}
