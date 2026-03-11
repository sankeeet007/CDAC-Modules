#include <iostream>
#include <cstring>
using namespace std;

int getLength(char* str) {
    int len = 0;
    while (str[len] != '\0') {
        len++;
    }
    return len;
}

void reverse(char* str) {
    int start = 0;
    int end = getLength(str) - 1;

    while (start < end) {
        char temp = str[start];
        str[start] = str[end];
        str[end] = temp;
        start++;
        end--;
    }
}

int main() {
    int capacity = 10;
    char* buffer = new char[capacity];
    char ch;
    cout << "Enter a string: " << endl;
    
    while (cin.get(ch)) {
        int i = 0;
        
        while (ch != '\n' && i < capacity - 1) {
            buffer[i++] = ch;
            if (!cin.get(ch)) 
            	break; 
        }
        
        buffer[i] = '\0';
        
        if (i > 0) {
            reverse(buffer);
            cout << "Reversed: " << buffer << endl;
        }
    }
    delete[] buffer;
    return 0;
}
