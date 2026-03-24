#include "address.h"
#include <iostream>
#include <cstring>
using namespace std;


//Default Constructor
Address::Address(){             
            HouseNo = 0;
            *Colony = '\0';
            *Area = '\0';
            *City = '\0';
            Pincode = 0;
}

//Parameterized constructor
Address::Address(int hn,const char* col,const char* area,const char* city, int pin){
            HouseNo = hn;
            Colony = new char[strlen(col)+1];
            Area = new char[strlen(area)+1];
            City = new char[strlen(city)+1];
            Pincode = pin;
            strcpy(Colony, col);
            strcpy(Area, area);
            strcpy(City, city);         
}

// Accept function for data input
void Address::acceptData(Address** a, int size){
    int hn;
    char cl[20];
    char ar[20];
    char ci[20];
    int pin;
    for(int i=0; i<size; i++){
        cout<<"Enter House Number: "<<endl;
        cin>>hn;
        cout<<"Enter your Colony: "<<endl;
        cin>>cl;
        cout<<"Enter your Area: "<<endl;
        cin>>ar;
        cout<<"Enter your City: "<<endl;
        cin>>ci;
        cout<<"Enter Pincode: "<<endl;
        cin>>pin;
        a[i] = new Address(hn, cl, ar, ci, pin);
    }
}

//Display function for Data Display
void Address::displayData(Address** a, int size){
    for(int i=0; i<size; i++){
        cout<<"House number: "<<a[i]->HouseNo<<endl;
        cout<<"Colony: "<<a[i]->Colony<<endl;
        cout<<"Area: "<<a[i]->Area<<endl;
        cout<<"City: "<<a[i]->City<<endl;
        cout<<"Pincode: "<<a[i]->Pincode<<endl;
    }
}

//Function to find whether two addresses are same
//Overload == operator
void Address::operator==(Address &ad){
    if(strcmp(Colony, ad.Colony)==0 && strcmp(Area, ad.Area)==0 && strcmp(City, ad.City)==0){
        cout<<"Same"<<endl;
    }
    else{
        cout<<"Not same"<<endl;
    }
}

Address::~Address(){
        if(!Colony)
        delete[] Colony;

        if(!Area)
        delete[] Area;

        if(!City)
        delete[] City;
}


