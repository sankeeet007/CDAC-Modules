#include<iostream>
#include<cstring>
#include "payslip.h"

using namespace std;

int main(){
    int size;
    cout<<"Enter size of array: "<<endl;
    cin>>size;
    Payslip** psl = new Payslip*[size];
    Payslip p;
    p.acceptData(psl, size);
    p.displayData(psl, size);
    Payslip p1=*psl[0];
    int totsal = p.calSalary(p1);
    cout<<"Sum: "<<totsal<<endl;
    return 0;
}