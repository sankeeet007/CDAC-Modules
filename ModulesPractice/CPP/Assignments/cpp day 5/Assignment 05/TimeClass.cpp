#include<iostream>
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

        Time operator+(Time t){
            Time tmp;
            tmp.ss = this->ss + t.ss;
            tmp.mm = this->mm + t.mm;
            tmp.hh = this->hh + t.hh;

            //Adjusting seconds
            if(tmp.ss>=60){
                tmp.mm += tmp.ss/60;
                tmp.ss%=60;
            }

            //Adjusting minutes
            if(tmp.mm>=60){
                tmp.hh += tmp.mm/60;
                tmp.mm%=60;
            }
            return tmp;
        }
        Time operator-(Time t){
            Time tmp;
            tmp.ss = this->ss - t.ss;
            tmp.mm = this->mm - t.mm;
            tmp.hh = this->hh - t.hh;

            //Adjusting seconds
            if(tmp.ss>=60){
                tmp.mm += tmp.ss/60;
                tmp.ss%=60;
            }

            //Adjusting minutes
            if(tmp.mm>=60){
                tmp.hh += tmp.mm/60;
                tmp.mm%=60;
            }
            return tmp;
        }
        bool operator==(Time t){
            
            return (t.ss==ss && t.mm==mm && t.hh==hh);
        }
        ~Time(){

        }
};
int main(){
    Time t1, t2, t3;
    cout<<"Enter first time: "<<endl;
    t1.acceptTime();
    cout<<"Enter second time: "<<endl;
    t2.acceptTime();
    cout<<"For operator+: "<<endl;
    t3=t1+t2;
    t1.displayTime();
    t2.displayTime();
    t3.displayTime();
    cout<<"For operator-: "<<endl;
    t3=t1-t2;
    t1.displayTime();
    t2.displayTime();
    t3.displayTime();
    cout<<"For operator==: "<<endl;
    cout<<t1.operator==(t2)<<endl;
    return 0;
}