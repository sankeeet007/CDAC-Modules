#include<iostream>
using namespace std;
void acceptArray(int *arr, int size){
	cout<<"Enter Array elements: "<<endl;
	for(int i=0; i<size; i++)
	{
		cin>>arr[i];
	}
}

void displayArray(int *arr, int size){
	cout<<"Displaying Array: "<<endl;
	for(int i=0; i<size; i++)
	{
		cout<<arr[i]<<", ";
	}
	cout<<endl;
}

void sortArray(int *arr, int size){
	int tmp;
	for(int j=0; j<size;j++)
	{
		for(int i=0; i<size-1; i++){
			if(arr[i]>arr[i+1])
			{
				tmp = arr[i+1];
				arr[i+1] = arr[i];
				arr[i] = tmp;
			}
		}
	}
}

int main(){
	int size;
	cout<<"Enter the size of array: "<<endl;
	cin>>size;
	int arr[size];
	acceptArray(arr, size);
	displayArray(arr, size);
	sortArray(arr, size);
	displayArray(arr, size);
	return 0;
}
