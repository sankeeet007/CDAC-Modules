#include<iostream>
using namespace std;
void acceptdata(int **p,int row,int col){
   for(int i=0;i<row;i++){
     for(int j=0;j<col;j++){
        cout<<"Enter row "<<i<<" col "<<j<<endl;
	cin>>p[i][j];
     
     }
   
   }

}

void displaydata(int **p,int row,int col){
   for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
         cout<<p[i][j]<<"\t";
      
      }
      cout<<endl;
   }
}


int main(){
  const int row=3,col=3;	
  int **p=new int*[row];//allocate rows 1 pointer for each row
  for(int i=0;i<row;i++){  //allocate memory for columns in each row
     p[i]=new int[col];
  }
  acceptdata(p,row,col);
  displaydata(p,row,col);
}
