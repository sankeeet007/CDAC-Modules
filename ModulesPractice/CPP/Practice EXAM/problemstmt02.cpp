/*✅ Question 2 — Bank Account System (Inheritance + Virtual + Exception + File)

Write a C++ program for Bank Account System

Create base class Account
accNo
name
balance

Create derived classes:
SavingAccount
CurrentAccount

Functions:
deposit()
withdraw()
display()

Rules:
Use virtual function
Use constructor in base and derived
Throw exception if withdraw > balance
Save all accounts in file
Read from file
Use pointer to base class

Use:
Inheritance
Virtual function
Exception
File handling
Pointer to object
Dynamic memory
*/
#include<iostream>
#include<cmath>
#include<fstream>

using namespace std;

//base class
class Account{
    protected:
        int accNo;
        string name;
        double balance;
    public:
        //constructor default+parameterized
        Account(int a=0, string nm='\0', double b=0.0){
            accNo = a;
            name = nm;
            balance = b;
        }
        //virtual functions
        virtual void deposit(double amt){
                balance += amt;
        }
        virtual void withdraw(double amt){
            if(amt > balance)
                throw "Insufficient Funds";
            
            balance -= amt;
        }   
        //virtual display
        virtual void display(){
            cout << "Account No:  " << accNo <<endl;
            cout << "Name:        " << name <<endl;
            cout << "Balance:     " << balance <<endl;
            
        }

        //write to file 
        void writetoFile(ofstream &out){
            out << accNo << " "
                << name << " "
                << balance <<endl;
        }
        virtual ~Account(){
            cout<<"Destructor"<<endl;
        }
};  

//derived saving
class SavingAccount:public Account{
    public:
        SavingAccount(int a, string nm, double b): Account(a,nm,b) {}

        void deposit(double amt){
            if(amt > 100000)
                throw "Savings: Need Banks approval";
            balance += amt;
        }
        void withdraw(double amt){
            if(amt > balance){
                throw "Savings: Insufficient funds";
            }
            balance -= amt;
        }

        void display(){
            cout<<"[ SAVINGS ]"<<endl;
            Account::display();
        }
};
//derived current
class CurrentAccount:public Account{
        public:
        CurrentAccount(int a, string nm, double b): Account(a,nm,b) {}
        void deposit(double amt){
            if(amt > 100000)
                throw "Current: Need Banks approval";
            balance += amt;
        }
        void withdraw(double amt){
            if(amt > balance + 1000){       //overdraft allowed
                throw "Savings: Limit exceeded";
            }

            balance -= amt;
        }

        void display(){
            cout<<"[ CURRENT ]"<<endl;
            Account::display();
        }
};


int main(){
    const int n=5;
    Account *acc[n];

    try
    {
        // dynamic objects
        acc[0] = new SavingAccount(1, "Amit", 5000);
        acc[1] = new CurrentAccount(2, "Ravi", 3000);
        acc[2] = new SavingAccount(3, "Neha", 7000);
        acc[3] = new CurrentAccount(4, "Kiran", 2000);

        // deposit
        acc[0]->deposit(1000);

        // withdraw
        acc[1]->withdraw(2000);

        // display
        cout << "\nAccount Details\n";
        
        for (int i = 0; i < 4; i++)
            acc[i]->display();

        //write to file
        ofstream out("Accounts.txt");

        for(int i=0; i<n; i++){
            acc[i]->writetoFile(out);
        }
    } catch(const char* msg){
        cout<<"Exception: "<<msg<<endl;
    }

    //delete memory
    for(int i=0; i<n; i++){
        delete acc[i];
    }
    return 0;
}












