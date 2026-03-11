#include <iostream>
using namespace std;

class Student {
private:
    char name[50];
    int mark1, mark2, mark3;

public:
    void getData() {
        cout << "Enter student name: "<<endl;
        cin >> name;
        cout << "Enter Mark 1: "<<endl;
        cin >> mark1;
        cout << "Enter Mark 2: "<<endl;
        cin >> mark2;
        cout << "Enter Mark 3: "<<endl;
        cin >> mark3;
    }

    void result() const {
        cout << "Name: " << name << endl;
        cout << " | Marks: " << mark1 << ", " << mark2 << ", " << mark3 << endl;
        
        if (mark1 >= 50 && mark2 >= 50 && mark3 >= 50) {
            cout << " | Status: PASS";
        } else {
            cout << " | Status: FAIL";
        }
        cout << endl;
    }
};

int main() {
    int n;
    cout << "Enter the number of students: ";
    cin >> n;

    Student* studentList = new Student[n];

    for (int i = 0; i < n; i++) {
        cout << "\n--- Input for Student " << (i + 1) << " ---";
        studentList[i].getData();
    }

    cout << "\n--- Student Results ---";
    for (int i = 0; i < n; i++) {
        studentList[i].result();
    }

    delete[] studentList;
    return 0;
}
