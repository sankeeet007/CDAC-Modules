#include<iostream>
using namespace std;

class Stock
{
    int stockLevel;
    float unitPrice;

public:

    // set values
    void setValues(int s, float p)
    {
        stockLevel = s;
        unitPrice = p;
    }

    // return stock
    int getStockLevel()
    {
        return stockLevel;
    }

    // return price
    float getUnitPrice()
    {
        return unitPrice;
    }

    // add stock
    void receipt(int qty)
    {
        stockLevel = stockLevel + qty;
        cout << "Stock updated after receipt.\n";
    }

    // remove stock
    void issue(int qty)
    {
        if(qty <= stockLevel)
        {
            stockLevel = stockLevel - qty;
            cout << "Stock issued successfully.\n";
        }
        else
        {
            cout << "Not enough stock available.\n";
        }
    }
};


int main()
{
    Stock item;

    int choice;
    int stock, qty;
    float price;

    do
    {
        cout << "\n------ MENU ------\n";
        cout << "1. Set Stock Details\n";
        cout << "2. Display Stock Details\n";
        cout << "3. Stock Receipt\n";
        cout << "4. Stock Issue\n";
        cout << "5. Exit\n";
        cout << "Enter choice: ";
        cin >> choice;

        switch(choice)
        {
            case 1:
                cout << "Enter stock level: ";
                cin >> stock;

                cout << "Enter unit price: ";
                cin >> price;

                item.setValues(stock, price);
                break;

            case 2:
                cout << "Stock Level = "
                     << item.getStockLevel() << endl;

                cout << "Unit Price = "
                     << item.getUnitPrice() << endl;
                break;

            case 3:
                cout << "Enter quantity received: ";
                cin >> qty;

                item.receipt(qty);
                break;

            case 4:
                cout << "Enter quantity issued: ";
                cin >> qty;

                item.issue(qty);
                break;

            case 5:
                cout << "Exiting program...\n";
                break;

            default:
                cout << "Invalid choice\n";
        }

    } while(choice != 5);

    return 0;
}