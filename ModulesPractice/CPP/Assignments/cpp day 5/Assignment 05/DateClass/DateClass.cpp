/*
3. Create Date class with data members
    dd
    mm
    yyyy
and implement following
• Default constructor
• Parameterized constructor
• Destructor
• Function to find out difference between two dates
• Function to compare dates
• Separate header and implementation files
• Overlaod ==, !=, +, - operator
*/
#include "date.h"
#include<iostream>
using namespace std;

Date::Date(){
        dd=0;
        mm=0;
        yyyy=0;
  
}

Date::Date(int d, int m, int y){
    dd=d;
    mm=m;
    yyyy=y;
}
void Date::acceptDate(){
    cout<<"Enter DD/MM/YYYY: ";
    cin>>dd>>mm>>yyyy;
}
void Date::displayDate(){
    cout<<dd<<":"<<mm<<":"<<yyyy<<endl;
}
void Date::operator==(Date d){
    if(dd==d.dd && mm==d.mm && yyyy==d.yyyy){
        cout<<"Both Dates are similar."<<endl;
    }
    else{
        cout<<"Both Dates are not similar."<<endl;
    }
}
void Date::operator!=(Date d){
    if(dd!=d.dd && mm!=d.mm && yyyy!=d.yyyy){
        cout<<"Both Dates are Not similar."<<endl;
    }
    else{
        cout<<"Both Dates are similar."<<endl;
    }
}
Date Date::operator+(Date d){
        Date tmp;
        tmp.dd = dd + d.dd;
        tmp.mm = mm + d.mm;
        tmp.yyyy = yyyy + d.yyyy;
        return tmp;
}
Date Date::operator-(Date d){
        Date tmp;
        tmp.dd = dd - d.dd;
        tmp.mm = mm - d.mm;
        tmp.yyyy = yyyy - d.yyyy;
        return tmp;
}
Date::~Date(){
    //Destructor
}