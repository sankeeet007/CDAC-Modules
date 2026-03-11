#include<iostream>
#include<cstring>
using namespace std;

class Donor{
    private:
        int dNumber;
        char* dName;
        int dAge;
        char* dAddress;
        char* sex;
        char* dBloodgroup;
    public:
        Donor(){
            dNumber = 0;
            dName = NULL;
            dAge = 0;
            dAddress = NULL;
            sex = NULL;
            dBloodgroup = NULL;
        }
        Donor(int dNum,const char* dNm, int dA,const char* dAdre,const char* dS,const char* dBG){
            //size allocation
            dName = new char[strlen(dNm)+1];
            dAddress = new char[strlen(dAdre)+1];
            sex = new char[strlen(dS)+1];
            dBloodgroup = new char[strlen(dBG)+1];
            //values are stored
            dNumber = dNum;
            strcpy(dName,dNm);
            dAge = dA;
            strcpy(dAddress,dAdre);
            strcpy(sex,dS);
            strcpy(dBloodgroup,dBG);
        }
        //accepting donar data
        void acceptData(Donor** dnr, int size){
            int num;
            char nm[30];
            int a;
            char adr[50];
            char sx[10];
            char bloodgrp[5];
            for(int i=0; i<size; i++){
                cout<<"Enter Donar ID: "<<endl;
                cin>>num;
                cout<<"Enter Donar Name: "<<endl;
                cin>>nm;
                cout<<"Enter Donar Address: "<<endl;
                cin>>adr;
                cout<<"Enter Donar Age: "<<endl;
                cin>>a;
                cout<<"Enter Donar Sex: "<<endl;
                cin>>sx;
                cout<<"Enter Donar Blood Group: "<<endl;
                cin>>bloodgrp;
                dnr[i] = new Donor(num, nm, a, adr, sx, bloodgrp);
            }
        }

        //displaying category 1 donars: O+ donars
        void category1(Donor** cnr, int size){
            for(int i=0; i<size; i++){
                if(strcmp(cnr[i]->dBloodgroup,"O+")==0)
                {
                    cout<<"----------------------------"<<endl;
                    cout<<"Donor Number: "<<cnr[i]->dNumber<<endl;
                    cout<<"Donor Name: "<<cnr[i]->dName<<endl;
                    cout<<"Donor Address: "<<cnr[i]->dAddress<<endl;
                }
            }
        }
        //displaying category 2 donars: Age group 18-25
        void category2(Donor** cnr, int size){
            for(int i=0; i<size; i++){
                if((cnr[i]->dAge >= 18 )&& (cnr[i]->dAge <= 25 ))
                {
                    cout<<"----------------------------"<<endl;
                    cout<<"Donor Number: "<<cnr[i]->dNumber<<endl;
                    cout<<"Donor Name: "<<cnr[i]->dName<<endl;
                    cout<<"Donor Address: "<<cnr[i]->dAddress<<endl;
                }
            }
        }
        //displaying category 3 donars: Female Donor with BloodGroup A, and Age between 21-24
        void category3(Donor** cnr, int size){
            for(int i=0; i<size; i++){
                if((strcmp(cnr[i]->dBloodgroup,"A") == 0) && (cnr[i]->dAge >= 21 ) && (cnr[i]->dAge <= 24)  && (strcmp(cnr[i]->sex,"Female" ) == 0))
                {
                    cout<<"----------------------------"<<endl;
                    cout<<"Donor Number: "<<cnr[i]->dNumber<<endl;
                    cout<<"Donor Name: "<<cnr[i]->dName<<endl;
                    cout<<"Donor Address: "<<cnr[i]->dAddress<<endl;
                }
            }
        }
        //displaying category 4 donars: O+ donars
        void category4(Donor** cnr, int size){
            for(int i=0; i<size; i++){
            
                    cout<<"----------------------------"<<endl;
                    cout<<"Donor Number: "<<cnr[i]->dNumber<<endl;
                    cout<<"Donor Name: "<<cnr[i]->dName<<endl;
                    cout<<"Donor Address: "<<cnr[i]->dAddress<<endl;
            }
        }
};
int main(){
    int size, choice;
    cout<<"Enter total number of Donors: "<<endl;
    cin>>size;
    Donor** dnr = new Donor*[size];
    Donor d;
    d.acceptData(dnr,size);
    
    do{
        cout<<"1. O+ Donors\n2. Age 18-25 Donors\n3. Female, Blood Group A, Age 21-24 Donors\n4. Display All Donors\n5. Exit"<<endl;
        cin>>choice;
        switch(choice){
            case 1: d.category1(dnr, size);
                    cout<<"----------------------------"<<endl;
                    break;

            case 2: d.category2(dnr, size);
                    cout<<"----------------------------"<<endl;
                    break;

            case 3: d.category3(dnr, size);
                    cout<<"----------------------------"<<endl;
                    break;

            case 4: d.category4(dnr, size);
                    cout<<"----------------------------"<<endl;
                    break;

            case 5: //exit
                    break;
            default: cout<<"Invalid Input!!!"<<endl;
                    break;
        }
    }while(choice!=5);

    return 0;
}
