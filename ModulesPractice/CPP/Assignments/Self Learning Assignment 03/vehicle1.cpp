#include <iostream>
#include <string>
#include <vector>
#include <fstream>
#include <stdexcept>
using namespace std;

template<typename T>

bool validateYear(T year){
    return year<=2026 && year >=2000;
}

class Vehicle{
    protected:
    string regno,modelname,manufact;
    int year;

    public:
        Vehicle(int y = 0,string regno="", string modelname="", string manufact=""){
            if(!validateYear(y)) throw out_of_range("invalid year");
            this->year = y;
            this->regno = regno;
            this->modelname = modelname;
            this->manufact = manufact;
            if(!regno.size() || !modelname.size() || !manufact.size()) throw invalid_argument("quantity is empty");
        }
        
        virtual void display_info() =0;
        // virtual void save(ofstream & fout) = 0;
    };
    
    class Car:public Vehicle{
        string fueltype;
        public:
        Car(string fuel="",int y=0,string regno="",string modelname="",string manufact=""):Vehicle(y,regno,modelname,manufact){
            this->fueltype = fuel;
            if(!fueltype.size()) throw invalid_argument("quantity1 is empty");
        }
        void display_info(){
            cout<<"fueltype: "<<fueltype<<endl;
            cout<<"regno: "<<regno<<endl;
            cout<<"model name: "<<modelname<<endl;
            cout<<"manufact: "<<manufact<<endl;
            cout<<"year: "<<year<<endl;
        }
        void save(ofstream &fout){
            char type = 'C';
            fout.write((char*)&type,sizeof(char));
            fout.write((char*)&year,sizeof(int));
            size_t size = regno.size();
            fout.write((char*)&size,sizeof(size));
            fout.write(regno.c_str(),size);
            size = modelname.size();
            fout.write((char*)&size,sizeof(size));
            fout.write(modelname.c_str(),size);
            size = manufact.size();
            fout.write((char*)&size,sizeof(size));
            fout.write(manufact.c_str(),size);
            size = fueltype.size();
            fout.write((char*)&size,sizeof(size));
            fout.write(fueltype.c_str(),size);
        }
    };
    class Bike:public Vehicle{
        string engineCapacity;
        public:
        Bike(string engineCapacity=0,int y=0,string regno="",string modelname="",string manufact=""):Vehicle(y,regno,modelname,manufact){
            this->engineCapacity = engineCapacity;
            if(!engineCapacity.size()) throw invalid_argument("quantity is empty");
        }
        void display_info(){
            cout<<"engineCapacity: "<<engineCapacity<<endl;
            cout<<"regno: "<<regno<<endl;
            cout<<"model name: "<<modelname<<endl;
            cout<<"manufact: "<<manufact<<endl;
            cout<<"year: "<<year<<endl;
        }
        void save(ofstream &fout){
            char type = 'B';
            fout.write((char*)&type,sizeof(char));
            fout.write((char*)&year,sizeof(int));
            size_t size = regno.size();
            fout.write((char*)&size,sizeof(size));
            fout.write(regno.c_str(),size);
            size = modelname.size();
            fout.write((char*)&size,sizeof(size));
            fout.write(modelname.c_str(),size);
            size = manufact.size();
            fout.write((char*)&size,sizeof(size));
            fout.write(manufact.c_str(),size);
            size = engineCapacity.size();
            fout.write((char*)&size,sizeof(size));
            fout.write(engineCapacity.c_str(),size);
        }
};

int main(){
    int n;
    cout<<"enter the number to vehicle"<<endl;
    cin>>n;

    ofstream fout("vehicle1.dat",ios::binary | ios::app);
    char choice;
    string rn,mn,mf,ft,ec;
    int y;
    for(int i=0;i<n;i++){
        cout<<"enter your choice [C/B]: "<<endl;
        cin>>choice;
        try{
            switch(choice){
                case 'C':{
                    cout<<"Enter Registration Number:"<<endl;
                    cin>>rn;
                    cout<<"Enter Model Name:"<<endl;
                    cin>>mn;
                    cout<<"Enter Manufacturer:"<<endl;
                    cin>>mf;
                    cout<<"Enter Year:"<<endl;
                    cin>>y;
                    cout<<"Enter Fuel type:"<<endl;
                    cin>>ft;
                    Car c(ft,y,rn,mn,mf);
                    c.display_info();
                    c.save(fout);
                    
                    // v[i]->display_info();
                    break;
                }
                case 'B':{
                    cout<<"Enter Registration Number:"<<endl;
                    cin>>rn;
                    cout<<"Enter Model Name:"<<endl;
                    cin>>mn;
                    cout<<"Enter Manufacturer:"<<endl;
                    cin>>mf;
                    cout<<"Enter Year:"<<endl;
                    cin>>y;
                    cout<<"Enter Engine Capacity::"<<endl;
                    cin>>ec;
                    Bike b(ec,y,rn,mn,mf);
                    b.display_info();
                    b.save(fout);
                    // v[i]->display_info();
                    break;}
                }
        }catch(const exception &e){
            cout<<e.what()<<endl;
        }
    }
    return 0;
}