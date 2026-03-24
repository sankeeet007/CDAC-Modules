#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    int arr[3];
    arr[0]=1000;
    arr[1]=200;
    arr[2]=5;
    for(int i=0;i<3;i++){
       cout<<setw(6)<<arr[i]<<endl;
    }
    cout << setw(10) << "ID" << setw(10) << "Marks" << endl;
    cout << setw(10) << 101 << setw(10) << 85 << endl;

    return 0;
}
