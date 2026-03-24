#include<iostream>
using namespace std;

void acceptData(int** arr, int r, int c){
    cout<<"Input Data for 2-D Array: "<<endl;
    for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            cout<<"Enter Data for"<<i+1<<" row "<<j+1<<"Column:  ";
            cin>>arr[i][j];
        }
        cout<<endl;
    }
}

void displayData(int** arr, int r, int c){
    cout<<"Displaying Data: "<<endl;
    for(int i=0; i<r; i++){
        cout<<"|  ";
        for(int j=0; j<c; j++){
            cout<<arr[i][j]<<"|  \t";
        }
        cout<<endl;
    }
}
int main(){
    const int row=3,col=3;
    int** dynamic2D = new int*[row];
    for(int i=0; i<row; i++){
        dynamic2D[i] = new int[col];
    }
    acceptData(dynamic2D, row,col);
    displayData(dynamic2D, row,col);
    return 0;

}