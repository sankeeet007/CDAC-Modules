#include <iostream>
#include <map>
using namespace std;

int main() {
    //map<string,vector<string>>
    map<int,string> student;

    student[101] = "Rahul";   //{101,Rahul}
    student[102] = "Amit";
    student[103] = "Neha";
    
    //insert data --- returns value if data inserted successfully
    auto result = student.insert({101,"Rajesh"});

    if(result.second)
    	cout<<"Inserted";
    else
    	cout<<"Key already exists";

    student.insert(pair<int,string>(105,"Ashish"));
    student.insert(make_pair<int,string>(104,"Rajan"));

    map<int,string>::iterator it;

    for(it = student.begin(); it != student.end(); it++)
	{
    		cout<<it->first<<" "<<it->second<<endl;
	}


    for(auto p : student)
    {
        cout << p.first << " -> " << p.second << endl;
    }
    //search data
    if(student.find(103) != student.end())
        cout<<"student: "<<student[103]<<endl;
    else
        cout<<"Student not found";

    student[103]="Rajesh";
    cout<<"modified value for 103 : "<<student[103]<<endl; 
}


