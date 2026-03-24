#include <iostream>
#include <fstream>
using namespace std;

// Base class
class Employee
{
protected:
    int id;
    string name;
    double salary;

public:

    Employee()
    {
        id = 0;
        name = "";
        salary = 0;
    }

    Employee(int i, string n, double s)
    {
        if (s < 0)
            throw "Invalid salary";

        id = i;
        name = n;
        salary = s;
    }

    virtual void input()
    {
        cout << "Enter id: ";
        cin >> id;

        cout << "Enter name: ";
        cin >> name;

        cout << "Enter salary: ";
        cin >> salary;

        if (salary < 0)
            throw "Salary cannot be negative";
    }

    virtual void calculateSalary()
    {
        // base
    }

    virtual void display()
    {
        cout << "ID: " << id
             << " Name: " << name
             << " Salary: " << salary << endl;
    }

    double getSalary()
    {
        return salary;
    }

    void writeFile(ofstream &out)
    {
        out << id << " "
            << name << " "
            << salary << endl;
    }

    virtual ~Employee() {}
};


// Manager class
class Manager : public Employee
{
    double bonus;

public:

    void input()
    {
        Employee::input();

        cout << "Enter bonus: ";
        cin >> bonus;
    }

    void calculateSalary()
    {
        salary = salary + bonus;
    }

    void display()
    {
        cout << "[Manager] ";
        Employee::display();
    }
};


// Developer class
class Developer : public Employee
{
    double overtime;

public:

    void input()
    {
        Employee::input();
        cout << "Enter overtime: ";
        cin >> overtime;
    }

    void calculateSalary()
    {
        salary = salary + overtime;
    }

    void display()
    {
        cout << "[Developer] ";
        Employee::display();
    }
};


// Template function
template <class T>
T findMax(T arr[], int n)
{
    T max = arr[0];

    for (int i = 1; i < n; i++)
    {
        if (arr[i] > max)
            max = arr[i];
    }

    return max;
}



int main()
{
    int n;

    cout << "Enter number of employees: ";
    cin >> n;

    Employee* emp[50];

    try
    {
        for (int i = 0; i < n; i++)
        {
            int type;

            cout << "\n1 Manager  2 Developer\n";
            cin >> type;

            if (type == 1)
                emp[i] = new Manager();

            else
                emp[i] = new Developer();

            emp[i]->input();
            emp[i]->calculateSalary();
        }


        cout << "\nEmployee Details\n";

        double sal[50];

        for (int i = 0; i < n; i++)
        {
            emp[i]->display();
            sal[i] = emp[i]->getSalary();
        }


        // template function
        double maxSal = findMax(sal, n);

        cout << "\nHighest Salary = " << maxSal << endl;


        // file write
        ofstream out("emp.txt");

        for (int i = 0; i < n; i++)
            emp[i]->writeFile(out);

        out.close();
    }
    catch (const char* msg)
    {
        cout << "Exception: " << msg << endl;
    }


    // delete memory
    for (int i = 0; i < n; i++)
        delete emp[i];

    return 0;
}