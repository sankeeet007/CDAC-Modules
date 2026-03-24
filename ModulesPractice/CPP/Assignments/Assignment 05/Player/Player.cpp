#include "Player.h"
#include<iostream>
#include<cstring>
using namespace std;

Player::Player(){
    //char* name = new char[1];
    name = nullptr;
    age = 0;
    //char* country = new char[1];
    country = nullptr;
}

Player::Player(const char* nm, int ag, const char* cntry){
    name = new char[strlen(nm)+1];
    strcpy(name, nm);
    age = ag;
    country = new char[strlen(cntry)+1];
    strcpy(country, cntry);
}

void Player::acceptData(Player** p, int size){
    //char* nm = new char[1];
    char nm[100] = {0};
    int a = 0;
    //char* cntry = new char[1];
    char cntry[20] = {0};

    for(int i=0; i<size; i++){
        cout<<"Enter name: "<<endl;
        cin>>nm;
        cout<<"Enter age: "<<endl;
        cin>>a;
        cout<<"Enter country: "<<endl;
        cin>>cntry;

        p[i] = new Player(nm, a, cntry);
    }
}

void Player::displayData(Player** p, int size){

    for(int i=0; i<size; i++){
        cout<<"name: "<<p[i]->name<<endl;
        cout<<"age: "<<p[i]->age<<endl;
        cout<<"country: "<<p[i]->country<<endl;
    }
}

void Player::sortArray(Player** p, int size){
    Player *temp;
    for(int i=0; i<size-1; i++){
        for(int j=0; j<size-i-1; j++){
            if(strcmp(p[j]->name, p[j+1]->name) > 0){
                temp = p[j];
                p[j] = p[j+1];
                p[j+1] = temp;
            }
            else if(strcmp(p[j]->name, p[j+1]->name)==0){
                if(p[j]->age > p[j+1]->age){
                    temp=p[j];
                    p[j]=p[j+1];
                    p[j+1]=temp;
                }
            }
        }
    }


}
