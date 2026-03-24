#include <iostream>
#include <iomanip>
using namespace std;

int main() {

    float pi = 3.1415926;
    //int price=345631;
    //cout<<"discount amt : "<<(float)(price/3.0)<<endl; 
    cout << fixed<<setprecision(3) << pi << endl;
    cout << fixed << setprecision(2) << pi << endl;

    return 0;
}
