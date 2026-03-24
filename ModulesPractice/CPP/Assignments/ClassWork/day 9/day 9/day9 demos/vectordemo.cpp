#include<iostream>
#include<vector>
using namespace std;

int main(){
    vector<int> ob;
    int deletedval;

    ob.push_back(10);
    ob.push_back(20);
    ob.push_back(30);
    ob.push_back(10);
    ob.push_back(40);
    ob.push_back(7);
    //display data
    for(int i=0;i<ob.size();i++){
       cout<<ob[i]<<"\t";
    }
    //usin pop_back()
    //ob.pop_back();
    //erase 3 rd index value
    deletedval=ob[3];
    ob.erase(ob.begin()+3);
    for(int i=0;i<ob.size();i++){
        cout<<ob[i]<<"\t";
    }
    cout<<endl<<"deleted: " <<deletedval<<endl;
    cout<<ob.size()<<endl;

}
