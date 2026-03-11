#include<iostream>
#include<cstring>
using namespace std;

class consumers{
    private:
        char* name;
        int unitsConsumed;
        double bill;
    public:
        consumers(){
            name = NULL;
            unitsConsumed = 0;
            bill=60.00;
        }
        consumers(const char* nm, int units){
            name = new char[strlen(nm)+1];
            strcpy(name,nm);
            unitsConsumed = units;
            bill=60.00;
        }
        void acceptUsers(consumers** cns, int size){
            char n[20];
            int unit;
            for(int i=0; i<size; i++){
                cout<<"Enter User's Name: "<<endl;
                cin>>n;
                cout<<"Enter Units consumed: "<<endl;
                cin>>unit;
                
                cns[i] = new consumers(n, unit);
            }
        }
        void calculateBill(consumers** cns, int size){
            for(int i=0; i<size; i++){
                int units=cns[i]->unitsConsumed;
                double finalBill=0, surcharge=0;
                // Calculate amount based on slab
                if (units <= 100){
                    finalBill = units * 5.5;
                }
                else if (units <= 300)
                {
                    finalBill = (100 * 5.5) + (units - 100) * 7.25;
                }
                else
                {
                    finalBill = (100 * 5.5) + (200 * 7.25) + (units - 300) * 8.75;
                }

                // Minimum charge
                if (finalBill < 60)
                {
                    finalBill = 60;
                }

                // Surcharge condition
              if(finalBill > 750){
                    surcharge = (finalBill - 750) * 0.10;
                }

                cns[i]->bill = finalBill + surcharge;

            }
        }
        void displayUsers(consumers** cns, int size){
            for(int i=0; i<size; i++){
                cout<<"-------------------------------------"<<endl;
                cout<<"Name: "<<cns[i]->name<<endl;
                cout<<"Units: "<<cns[i]->unitsConsumed<<endl;
                cout<<"Bill: "<<cns[i]->bill<<endl;
                cout<<"-------------------------------------"<<endl;
            }
        }
        ~consumers(){
            delete[] name;
        }
};
int main(){
    int s;
    cout<<"Enter size of users array: "<<endl;
    cin>>s;
    consumers** cns = new consumers*[s];
    consumers c;
    c.acceptUsers(cns, s);
    c.calculateBill(cns,s);
    c.displayUsers(cns, s);
    //deleting memory to prevent memory leak
      for(int i=0;i<s;i++)
        delete cns[i];

    delete[] cns;

    return 0;
}