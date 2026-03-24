#include <iostream>
#include <fstream>
using namespace std;

class Student
{
private:
    int rollNo;
    string name;
    string dob;
    int marks[5];
    int total;

public:

    // Default constructor
    Student()
    {
        rollNo = 0;
        name = "";
        dob = "";
        total = 0;
    }

    // Parameterized constructor
    Student(int r, string n, string d, int m[])
    {
        rollNo = r;
        name = n;
        dob = d;
        total = 0;

        for (int i = 0; i < 5; i++)
        {
            if (m[i] > 100)
                throw "Marks cannot be greater than 100";

            marks[i] = m[i];
            total += m[i];
        }
    }

    // Copy constructor
    Student(const Student &s)
    {
        rollNo = s.rollNo;
        name = s.name;
        dob = s.dob;
        total = s.total;

        for (int i = 0; i < 5; i++)
            marks[i] = s.marks[i];
    }

    // Destructor
    ~Student()
    {
        // nothing special, just message
        // (for exam demonstration)
        // cout << "Destructor called\n";
    }

    void input()
    {
        total = 0;

        cout << "Enter Roll No: ";
        cin >> rollNo;

        cout << "Enter Name: ";
        cin >> name;

        cout << "Enter DOB: ";
        cin >> dob;

        cout << "Enter 5 marks:\n";

        for (int i = 0; i < 5; i++)
        {
            cin >> marks[i];

            if (marks[i] > 100)
                throw "Invalid marks entered";

            total += marks[i];
        }
    }

    void display()
    {
        cout << rollNo << " "
             << name << " "
             << dob << " "
             << total << endl;
    }

    int getRoll()
    {
        return rollNo;
    }

    int getTotal()
    {
        return total;
    }

    // write to file
    void writeFile(ofstream &out)
    {
        out << rollNo << " "
            << name << " "
            << dob << " "
            << total << endl;
    }
};

// sorting by roll number
void sortByRoll(Student *s, int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (s[i].getRoll() > s[j].getRoll())
            {
                Student temp = s[i];
                s[i] = s[j];
                s[j] = temp;
            }
        }
    }
}

// sorting by total marks
void sortByTotal(Student *s, int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (s[i].getTotal() < s[j].getTotal())
            {
                Student temp = s[i];
                s[i] = s[j];
                s[j] = temp;
            }
        }
    }
}

int main()
{
    int n = 5;

    // dynamic memory
    Student *s = new Student[n];

    try
    {
        // input
        for (int i = 0; i < n; i++)
        {
            cout << "\nStudent " << i + 1 << endl;
            s[i].input();
        }

        // sort by roll
        sortByRoll(s, n);

        cout << "\nSorted by Roll:\n";
        for (int i = 0; i < n; i++)
            s[i].display();

        // sort by total
        sortByTotal(s, n);

        cout << "\nSorted by Total:\n";
        for (int i = 0; i < n; i++)
            s[i].display();

        // file write
        ofstream out("student.txt");

        for (int i = 0; i < n; i++)
            s[i].writeFile(out);

        out.close();
    }
    catch (const char *msg)
    {
        cout << "Exception: " << msg << endl;
    }

    delete[] s;

    return 0;
}