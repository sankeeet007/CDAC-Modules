#include<iostream>
#include<cstring>

using namespace std;

class Student {
	private:
		int id;
		char sName[20];
		int marks[3];
	public:
		// Default Constructor
		Student() {
			id = 0;
			sName[0] = '\0';
			for(int i = 0; i < 3; i++) {
				marks[i] = 0;
			}
		}

		// Parameterized contructor
		Student(int id, const char* sName, int* marks) {
			this-> id = id;
		        strcpy(this->sName, sName);
	       		for(int i = 0; i < 3; i++) {
				this->marks[i] = marks[i];
			}		
		}

		// setters
		void setId(int id) {
			this->id = id;
		}
		void setSname(char *sName){
			strcpy(this->sName,sName);
		}
		void setMakrs1(int m1) {
			marks[0] = m1;

		}
		void setMarks2(int m2) {
			marks[1] = m2;
		}
		void setMarks3(int m3) {
			marks[2] = m3;

		}
		// getters
		int getId() {
			return id;
		}

		char* getname() {
			return sName;
		}
		int getMarks1() {
			return marks[0];
		}
		int getMarks2() {
			return marks[1];
		}
		int getMarks3() {
			return marks[2];
		}
		
		void display() {
			cout<<id<<", "<<sName<<", "<<marks[0];
			cout<<", "<<marks[1]<<", "<<marks[2]<<endl;

		}
		~Student() {};
};

int main() {
	int arr[] = {78, 80, 90};

Student s1(1, "Omkar", arr),s;
s1.display();
s.setId(12);
s.setSname("Revati");
s.setMarks1(98);
s.setMarks2(97);
s.setMarks3(99);
s.display();

}
