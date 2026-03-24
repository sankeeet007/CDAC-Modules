//Menu driven program

#include<iostream>
using namespace std;
void acceptNum(int* arr, int n){        //function for accepting number array
    
    cout<<"Enter elements: "<<endl;
    for(int i=0; i<n; i++)
    {
        cin>>arr[i];
    }
}

void acceptChar(char* charArray, int n){    //function for accepting character array
    
    cout<<"Enter Character: "<<endl;
    for(int i=0; i<n; i++)
    {
        cin>>charArray[i];
    }
}

void displayNum(int* arr, int n){       //function for displaying number array
    for(int i=0; i<n; i++)
    {
        cout<<arr[i]<<"  ";
    }
    cout<<endl;
}

void displayChar(char* charArray, int n){       //function for displaying character array
    for(int i=0; charArray[i]!='\0'; i++)
    {
        cout<<charArray[i];
    }
    cout<<endl;
}

void sort(int* arr, int n){             //function for sorting number array
    int  tmp;
    for(int i=0; i<n; i++){
        for(int j=0; j<n-1; j++)
        {
            if(arr[j]>arr[j+1]){
                tmp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=tmp;
            }
        }
    }
}
void average(int* arr, int n){      //function for finding average of array elements
    int sum=0;
    for(int i=0; i<n; i++){
        sum+=arr[i];
    }
    cout<<"Average of input number is: "<<(sum/n)<<endl;
}

void multiby2(int* arr,int n){      //function for multiplying number array by 2
    for(int i=0; i<n; i++){
        arr[i]=arr[i]*2;
    }
}

int main(){
    int n;
    int* arr = new int[n];
    char* charArray = new char[n];
    int choice;
    do{
        cout<<"********** Menu **********"<<endl;
        cout<<"1. sorted array\n2. print string\n3.find average\n4. multiply by 2\n5.exit"<<endl;
        cout<<"Enter your choice:"<<endl;
        cin>>choice;

        switch(choice){
            case 1: cout<<"Enter Total number of elements: "<<endl;
                    cin>>n;
                    acceptNum(arr, n);
                    sort(arr, n);
                    displayNum(arr, n);
                    break;

            case 2: cout<<"Enter Total number of elements: "<<endl;
                    cin>>n;
                    acceptChar(charArray, n);
                    displayChar(charArray, n);
                    break;


            case 3: cout<<"Enter Total number of elements: "<<endl;
                    cin>>n;
                    acceptNum(arr, n);
                    average(arr, n);
                    //displayNum(arr, n);
                    break;

            case 4: cout<<"Enter Total number of elements: "<<endl;
                    cin>>n;
                    acceptNum(arr, n);
                    multiby2(arr, n);
                    displayNum(arr, n);
                    break;
            case 5: //exit
                    cout<<"Exiting.........."<<endl;
                    break;
            default: cout<<"Invalid Input!!!"<<endl;
                    break;
        }
    }while(choice!=5);

    if(charArray!=NULL){
        delete[] charArray;
    }
    if(arr!=NULL){
        delete[] arr;
    }
    return 0;
}