#include<iostream>
using namespace std;
void acceptdata(int *p,int row,int col){
   for(int i=0;i<row;i++){
     for(int j=0;j<col;j++){
        cout<<"Enter row "<<i<<" col "<<j<<endl;
	cin>>p[i][j];
     
     }
   
   }

}

void displaydata(int *p,int row,int col){
   for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
         cout<<p[i][j]<<"\t";
      
      }
      cout<<endl;
   }
}


int main(){
  int *p=new int*[3];
  acceptdata(p,3,3);
  displaydata(p,3,3);
}
