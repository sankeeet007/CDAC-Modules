#ifndef ACCOUNT_H
#define ACCOUNT_H
#include <string>
using namespace std;
class Account {
protected:

    string fname,lname,mobile,email;
    float balance;
    float interestRate;
    float minBalance;
    string accId;

public:

    Account();

    Account(string f,string l,string m,string e,float b,float ir,float mb);

    Account(const Account &a);

    void generateId();

    string getId();

    virtual void accept();
    virtual void display();

    void deposit();

    void withdraw();
    virtual ~Account();
};

#endif
