#include "Account.h"
#include<iostream>
#include<string>

using namespace std;

    Account::Account()
    {
        balance=0;
        interestRate=0;
        minBalance=0;
    }

    Account::Account(string f,string l,string m,string e,float b,float ir,float mb)
    {
        fname=f;
        lname=l;
        mobile=m;
        email=e;
        balance=b;
        interestRate=ir;
        minBalance=mb;
        generateId();
    }

    Account::Account(const Account &a)
    {
        fname=a.fname;
        lname=a.lname;
        mobile=a.mobile;
        email=a.email;
        balance=a.balance;
        interestRate=a.interestRate;
        minBalance=a.minBalance;
        accId=a.accId;
    }

    void Account::generateId()
    {
        string last4 = mobile.substr(mobile.length()-4);
        accId = fname + lname + last4;
    }

    string Account::getId()
    {
        return accId;
    }

    void Account::accept()
    {
        cout<<"Enter First Name: ";
        cin>>fname;

        cout<<"Enter Last Name: ";
        cin>>lname;

        cout<<"Enter Mobile: ";
        cin>>mobile;

        cout<<"Enter Email: ";
        cin>>email;

        cout<<"Enter Balance: ";
        cin>>balance;

        generateId();
    }

    void Account::display()
    {
        cout<<"\nAccount ID: "<<accId<<endl;
        cout<<"Name: "<<fname<<" "<<lname<<endl;
        cout<<"Mobile: "<<mobile<<endl;
        cout<<"Email: "<<email<<endl;
        cout<<"Balance: "<<balance<<endl;
        cout<<"Interest Rate: "<<interestRate<<endl;
        cout<<"Minimum Balance: "<<minBalance<<endl;
    }

    void Account::deposit()
    {
        float amt;
        cout<<"Enter amount to deposit: ";
        cin>>amt;
        balance += amt;
        cout<<"Deposit Successful\n";
    }

    void Account::withdraw()
{
    float amt;
    cout<<"Enter amount to withdraw: ";
    cin>>amt;

    if(amt > balance)
    {
        cout<<"Insufficient Balance\n";
    }
    else if(balance - amt < minBalance)
    {
        cout<<"Cannot withdraw. Minimum balance must be "<<minBalance<<endl;
    }
    else
    {
        balance -= amt;
        cout<<"Withdraw Successful\n";
        cout<<"Remaining Balance: "<<balance<<endl;
    }
}

    Account::~Account(){}
