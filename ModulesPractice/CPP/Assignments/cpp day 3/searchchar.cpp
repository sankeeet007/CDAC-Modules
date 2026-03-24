#include<iostream>
using namespace std;

void acceptdata(char *arr, int size){
	cout<<"Enter characters in array: "<<endl;
	for(int i=0; i<size; i++){
		cin>>arr[i];
	}
}

void displaydata(char *arr, int size){
	cout<<"[";
	for(int i=0; i<size; i++){
		cout<<"\'"<<arr[i]<<"\',";
	}
	cout<<"]"<<endl;
}

int searchdata(char *arr, int size, char ch){
	int count=0;
	for(int i=0; i<size; i++){
		if(arr[i]==ch){
			count++;
		}
	}
	return count;
}

int main(){
	int no;
	char c;
	cout<<"Enter no. of characters: "<<endl;
	cin>>no;
	char arr[no];
	acceptdata(arr, no);
	displaydata(arr, no);
	cout<<"Enter a character to search: ";
	cin>>c;
	cout<<c<<" count is "<<searchdata(arr, no, c)<<endl;
	return 0;
}
