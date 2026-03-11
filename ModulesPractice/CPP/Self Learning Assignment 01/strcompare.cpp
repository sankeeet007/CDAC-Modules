#include <iostream>
#include <cstring>
using namespace std;

int compareStrings(char* s1, char* s2) {
    while (*s1 != '\0' || *s2 != '\0') {
        if (*s1 != *s2) {
            return (int)(*s1 - *s2); // Return the difference of ASCII values
        }
        s1++;
        s2++;
    }
    return 0;
}

int main() {
    int size1, size2;
    cout << "Enter max length for String 1: ";
    cin >> size1;
    char* str1 = new char[size1 + 1];
    cout << "Enter max length for String 2: ";
    cin >> size2;
    char* str2 = new char[size2 + 1];
    cout << "Enter String 1: ";
    cin >> str1;
    cout << "Enter String 2: ";
    cin >> str2;
    
    int result = compareStrings(str1, str2);

    cout << "\n--- Result ---" << endl;
    if (result == 0) {
        cout << "The strings are identical." << endl;
    } else {
        cout << "The strings are different." << endl;
        if (result > 0) 
            cout << "String 1 is greater than String 2." << endl;
        else 
            cout << "String 2 is greater than String 1." << endl;
    }
    delete[] str1;
    delete[] str2;
    return 0;
}
