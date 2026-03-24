#include<cstring>
#include<iostream>
#include "payslip.h"

using namespace std;

Payslip::Payslip(){
    EmpNo = 0;
    EmpName = nullptr;
    DA = 0;
    HRA = 0;
    BasicSalary = 0;
}

Payslip::Payslip(int empno, char* empnm, int da, int hra, int basicsal){
    EmpNo = empno;
    EmpName = new char[strlen(empnm)+1];
    strcpy(EmpName, empnm);
    DA = da;
    HRA = hra;
    BasicSalary = basicsal;
}

void Payslip::acceptData(Payslip** ps, int s){
    int eno = 0;
    char* enm = nullptr;
    int d = 0;
    int h = 0;
    int bs = 0;
    for(int i=0; i<s; i++){
        cout<<"Enter Employee Number: "<<endl;
        cin>>eno;
        cout<<"Enter Employee Name: "<<endl;
        cin>>enm;
        cout<<"Enter Employee DA: "<<endl;
        cin>>d;
        cout<<"Enter Employee HRA: "<<endl;
        cin>>h;
        cout<<"Enter Employee BasicSalary: "<<endl;
        cin>>bs;
        ps[i] = new Payslip(eno, enm, d, h, bs);
    }
}


void Payslip::displayData(Payslip** ps, int s){
    for(int i=0; i<s; i++){
        cout<<"Employee Number: "<<ps[i]->EmpNo<<endl;
        cout<<"Employee Name: "<<ps[i]->EmpName<<endl;
        cout<<"Employee DA: "<<ps[i]->DA<<endl;
        cout<<"Employee HRA: "<<ps[i]->HRA<<endl;
        cout<<"Employee Basic salary: "<<ps[i]->BasicSalary<<endl;
        cout<<endl;
    }
}

int Payslip::calSalary(Payslip p){
    int sum=0;
    sum +=p.BasicSalary;
    sum +=p.DA;
    sum +=p.HRA;
    return sum;
}
