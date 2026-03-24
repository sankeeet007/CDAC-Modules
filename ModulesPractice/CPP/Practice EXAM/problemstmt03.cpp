#include <iostream>
#include <vector>
#include <fstream>
using namespace std;

class Book
{
private:
    int id;
    string title;
    double price;

public:

    // default constructor
    Book()
    {
        id = 0;
        title = "";
        price = 0;
    }

    // parameterized constructor
    Book(int i, string t, double p)
    {
        if (p < 0)
            throw "Price cannot be negative";

        id = i;
        title = t;
        price = p;
    }

    // input operator >>
    friend istream &operator>>(istream &in, Book &b)
    {
        cout << "Enter id: ";
        in >> b.id;

        cout << "Enter title: ";
        in >> b.title;

        cout << "Enter price: ";
        in >> b.price;

        if (b.price < 0)
            throw "Invalid price";

        return in;
    }

    // output operator <<
    friend ostream &operator<<(ostream &out, Book &b)
    {
        out << b.id << " "
            << b.title << " "
            << b.price << endl;

        return out;
    }

    // operator ==
    bool operator==(int x)
    {
        return id == x;
    }

    // operator +
    double operator+(Book b)
    {
        return price + b.price;
    }

    int getId()
    {
        return id;
    }

    double getPrice()
    {
        return price;
    }
};

int main()
{
    vector<Book> lib;
    int choice;

    try
    {
        do
        {
            cout << "\n1 Add Book";
            cout << "\n2 Display";
            cout << "\n3 Search";
            cout << "\n4 Save File";
            cout << "\n5 Exit\n";

            cin >> choice;

            if (choice == 1)
            {
                Book b;
                cin >> b;
                lib.push_back(b);
            }

            else if (choice == 2)
            {
                for (int i = 0; i < lib.size(); i++)
                    cout << lib[i];
            }

            else if (choice == 3)
            {
                int x;
                cout << "Enter id: ";
                cin >> x;

                for (int i = 0; i < lib.size(); i++)
                {
                    if (lib[i] == x)
                        cout << lib[i];
                }
            }

            else if (choice == 4)
            {
                ofstream out("book.txt");

                for (int i = 0; i < lib.size(); i++)
                    out << lib[i];

                out.close();

                cout << "Saved to file\n";
            }

        } while (choice != 5);
    }
    catch (const char *msg)
    {
        cout << "Exception: " << msg << endl;
    }

    return 0;
}