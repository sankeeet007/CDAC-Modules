#include<iostream>
#include<cstring>
using namespace std;

class Time{
    private:
        int hh, mm, ss;
    public:
        //Parameterized constructor with default values   
        Time(int h=0, int m=0, int s=0){
            hh=h;
            mm=m;
            ss=s;
        }
        void acceptTime(){
            cout<<"Enter Time in HH:MM:SS format: "<<endl;
            cin>>hh>>mm>>ss;
        }
        void displayTime(){
            cout<<"HH: "<<hh<<" MM: "<<mm<<" SS: "<<ss<<endl;
        }

        void addSeconds(int sec){
            this->ss = ss + sec;
            if(ss >= 60){
                mm += ss/60;
                ss%=60;
            }

            //Adjusting minutes
            if(mm>=60){
                hh += mm/60;
                mm%=60;
            }
        }
         void addMinutes(int min){
            this->mm = mm + min;
         
            //Adjusting minutes
            if(mm>=60){
                hh += mm/60;
                mm%=60;
            }
        }
        void addHour(int hr){
            this->hh = hh + hr;
        }
};

int main(){
    int choice,h,m,s;
    Time t;
    t.acceptTime();
    do{
         cout<<"1. Add Hours\n2. Add Minutes\n3. Add Seconds\n4. Display Time\n5.Exit"<<endl;
        cin>>choice;
        switch(choice){
            case 1: cout<<"Enter Hours: "<<endl;
                    cin>>h;
                    t.addHour(h);
                    break;

            case 2: cout<<"Enter Minutes: "<<endl;
                    cin>>m;
                    t.addMinutes(m);
                    break;

            case 3: cout<<"Enter Seconds: "<<endl;
                    cin>>s;
                    t.addSeconds(s);
                    break;

            case 4: cout<<"Updated Time: "<<endl;
                    t.displayTime();

            case 5: //exit
                    break;
            default: cout<<"Invalid Input!!!"<<endl;
                    break;
        }
    }while(choice!=5);
    return 0;
}