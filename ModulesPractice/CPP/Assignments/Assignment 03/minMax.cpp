#include<iostream>
#include<climits>
using namespace std;
void acceptArray(int *arr, int size){
	cout<<"Enter Array elements: "<<endl;
	for(int i=0; i<size; i++)
	{
		cin>>arr[i];
	}
}

int findMin(int *arr, int size){
	int res=INT_MAX;
	for(int i=0; i<size; i++)
	{
		if(arr[i]<=res)
		{
			res=arr[i];
		}
	}
	return res;
}

int findMax(int *arr, int size){
	int res=INT_MIN;
	for(int i=0; i<size; i++)
	{
		if(arr[i]>=res)
		{
			res=arr[i];
		}
	}
	return res;
}

int findSecMin(int *arr, int size){
	int smin=INT_MAX;
	int min=INT_MAX;
	
	if(sizeof(arr) < 2){	return -1; }	//edge case
	
	for(int i=0; i<size; i++)		//10,33,45,22,67
	{
		if(arr[i]<min)			
		{
			smin = min;
			min=arr[i];
		}
		else if(arr[i]<smin && arr[i]!=min)
		{
			smin = arr[i];
		}
	}
	return smin;
}


int findSecMax(int *arr, int size){
	int smax=INT_MIN;
	int max=INT_MIN;
	
	if(sizeof(arr) < 2){	return -1; }  //edge case
	
	for(int i=0; i<size; i++)		//10,33,45,22,67
	{
		if(arr[i]>max)			
		{
			smax = max;
			max=arr[i];
		}
		else if(arr[i]>smax && arr[i]!=max)
		{
			smax = arr[i];
		}
	}
	return smax;
}

int main(){
	int size;
	cout<<"Enter the size of array: "<<endl;
	cin>>size;
	int arr[size];
	acceptArray(arr, size);
	int min = findMin(arr, size);		//Minimum Number
	cout<<"Minimum Number in array is: "<<min<<endl;
	
	int max = findMax(arr, size);		//Maximum Number
	cout<<"Maximum Number in array is: "<<max<<endl;
	
	int secMin = findSecMin(arr, size);		//Second Minimum Number
	cout<<"Second Minimum Number in array is: "<<secMin<<endl;
	
	int secMax = findSecMax(arr, size);		//Second Maximum Number
	cout<<"Second Maximum Number in array is: "<<secMax<<endl;
	return 0;
}
