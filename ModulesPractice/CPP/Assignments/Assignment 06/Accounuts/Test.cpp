/*
28. create following classes using Inheritance
and test whether you can create objects of all classes,
and also check whether you can call functions of the classes

Design a system for XYZ Bank for storing account details,
Every account will have type either saving account or current account or demat account
For every account interest rate and minimum balance need to be stored.
Interest rate for saving account is 4% and for current account 1%
Minimum balance for saving account will be 20000 and current account will be 1000
For each account store account holder details(fname, lname, mobile, email)

If it’s a saving account, then store chequebooknumber
If current account then store number of transactions/day, number of transactions will be different
for every account based on average annual balance in the account and will keep on changing based
on how customer maintains the balance in the account.

For demat account store share details, for every share store name, number of shares buying price,
date of purchase, selling price, date of selling.



//add this class for joint account
AccHolder
private
fname,lname,mobile,email,id

Account
AccountHolder *arr[3] //add only if joint account is needded
private
fname,lname,mobile,email,id
,pin
char * generateId(fname,lname) private static

protected
balance,

static
count

public
acceptdata
displaydata
getBalance()
changePin()
virtual bool withdrwal(double amt)=0
virtual bool deposit(double amt)=0

Saving Account
interestrate,minbalance static
private
chequebknum

public
acceptdata
display
bool withdraw(double amt){
if(balance-amt>=minbalance)
balance=balance-amt;
else
//throw exception
throw "insufficient balance"
}
bool deposite(double amt)

CurrentAccount
interestrate,minbalance static
private
transnum

public
bool withdraw(double amt){
if(balance-amt>=minbalance)
balance=balance-amt;
else
//throw exception
throw "insufficient balance"
}
bool deposite(double amt)

DEmatAccount
private

share *sarr[100]

public
bool withdraw(double amt){
if(balance>=amt)
balance=balance-amt;
else
//throw exception
throw "insufficient balance"
}
bool deposite(double amt)
sellStock
buystock

Share
private
sname,numshares,pdate,pprice,sdate,sprice
*/