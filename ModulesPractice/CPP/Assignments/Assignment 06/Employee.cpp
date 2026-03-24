/*Create function for printing an array and call it from main (Employee array)
store empid,name,sal, sort it on salary and display in sorted order of sal
ask user whether to sort in ascending or descending order and do accordingly.*/

#include<iostream>
#include<cstring>
using namespace std;

class Employee{
    private:
            int empid;
            char* name;
            double salary;
    public: 
            Employee(){
                empid = 0;
                *name = '\0';
                salary = 0.0;
            }

            Employee(int emp_id, const char* nm, double sal){
                empid = emp_id;
                name = new char[strlen(nm)+1];
                strcpy(name, nm);
                salary = sal;
            }

            void acceptData(Employee** emp, double size){
                int eid = 0;
                char nm[30] = {0};
                double sal = 0.0;
                for(int i=0; i<size; i++){
                    cout<<"Enter Employee ID: "<<endl;
                    cin>>eid;
                    cout<<"Enter Employee Name: "<<endl;
                    cin>>nm;
                    cout<<"Enter Employee Salary: "<<endl;
                    cin>>sal;

                    emp[i] = new Employee(eid, nm, sal);
                }   
            }

            void displayData(Employee** emp, int size){
                for(int i=0; i<size; i++){
                    cout<<"ID: "<<emp[i]->empid<<endl;
                    cout<<"Name: "<<emp[i]->name<<endl;
                    cout<<"Salary: "<<emp[i]->salary<<endl;
                }   
            }

            void sortAsc(Employee** emp, int size){
                Employee* tmp;
                for(int i=0; i<size; i++){
                    for(int j=0; j<size-1-i; j++){
                        if(emp[j]->salary > emp[j+1]->salary){
                            tmp = emp[j];
                            emp[j] = emp[j+1];
                            emp[j+1] = tmp;
                        }
                    }
                }
            }
            void sortDesc(Employee** emp, int size){
                Employee* tmp;
                for(int i=0; i<size; i++){
                    for(int j=0; j<size-1-i; j++){
                        if(emp[j]->salary < emp[j+1]->salary){
                            tmp = emp[j];
                            emp[j] = emp[j+1];
                            emp[j+1] = tmp;
                        }
                    }
                }
            }
           
};

int main(){
        int n, ch;
        cout<<"Enter size of array: "<<endl;
        cin>>n;
        Employee** emp = new Employee*[n];
        Employee e;
        // e.acceptData(emp, n);
        // cout<<"----------------------"<<endl;
        // e.displayData(emp, n);
        // cout<<"----------------------"<<endl;
        do{
            cout<<"1. Accept Data\n2. Sort Ascending\n3. Sort Descending\n4. Display\n5.Exit"<<endl;
            cin>>ch;
            switch(ch){

                case 1: e.acceptData(emp, n);
                        break;
                
                case 2: e.sortAsc(emp, n);
                        cout<<"--------------------------------"<<endl;
                        e.displayData(emp,n);
                        break;

                case 3: e.sortDesc(emp, n);
                        cout<<"--------------------------------"<<endl;
                        e.displayData(emp,n);
                        break;

                case 4: e.displayData(emp, n);
                        break;

                case 5: //exit
                        break;

                default: cout<<"Invalid Input!!!"<<endl;
                        break;
            }
        }while(ch!=5);
        delete[] emp;
    return 0;
}