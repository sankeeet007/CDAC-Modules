#include<iostream>
using namespace std;

class Matrix{
    int a[3][3];
public:
    void accept(){
        cout<<"Enter matrix elements:\n";
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                cin>>a[i][j];
            }
        }
    }

    void display(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                cout<<a[i][j]<<" ";
            }
            cout<<endl;
        }
    }

    // Addition
    Matrix operator + (Matrix m){
        Matrix temp;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                temp.a[i][j] = a[i][j] + m.a[i][j];
            }
        }
        return temp;
    }

    // Subtraction
    Matrix operator - (Matrix m){
        Matrix temp;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                temp.a[i][j] = a[i][j] - m.a[i][j];
            }
        }
        return temp;
    }

    // Multiplication
    Matrix operator * (Matrix m){
        Matrix temp;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                temp.a[i][j] = 0;
                for(int k=0;k<3;k++){
                    temp.a[i][j] += a[i][k] * m.a[k][j];
                }
            }
        }

        return temp;
    }
};

int main(){
    Matrix m1, m2, result;
    int choice;

    cout<<"Enter Matrix 1\n";
    m1.accept();

    cout<<"Enter Matrix 2\n";
    m2.accept();

    do{
        cout<<"\n1.Add\n2.Subtract\n3.Multiply\n4.Exit\n";
        cout<<"Enter choice: ";
        cin>>choice;

        switch(choice) {
            case 1:
                result = m1 + m2;
                cout<<"Addition:\n";
                result.display();
                break;

            case 2:
                result = m1 - m2;
                cout<<"Subtraction:\n";
                result.display();
                break;

            case 3:
                result = m1 * m2;
                cout<<"Multiplication:\n";
                result.display();
                break;
        }

    }while(choice != 4);

    return 0;
}