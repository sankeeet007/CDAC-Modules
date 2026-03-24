#include <iostream>
#include <vector>
#include <algorithm> // Required for  remove
using namespace std;

// Function to add an element to the vector
void addElement( vector<int>& vec, int value) {
    vec.push_back(value);
     cout << "Added " << value << " to the vector." <<  endl;
}

// Function to delete an element from the vector by value
void deleteElementByValue( vector<int>& vec, int value) {
    auto it =  remove(vec.begin(), vec.end(), value);
    if (it != vec.end()) {
        vec.erase(it, vec.end());
         cout << "Deleted all occurrences of " << value << " from the vector." <<  endl;
    } else {
         cout << value << " not found in the vector." <<  endl;
    }
}

// Function to delete an element from the vector by index
void deleteElementByIndex( vector<int>& vec, int index) {
    if (index >= 0 && index < vec.size()) {
        int deletedValue = vec[index];
        vec.erase(vec.begin() + index);
         cout << "Deleted element at index " << index << " (value: " << deletedValue << ") from the vector." <<  endl;
    } else {
         cout << "Invalid index: " << index << ". Cannot delete." <<  endl;
    }
}

// Function to display all elements in the vector
void displayVector(const  vector<int>& vec) {
    if (vec.empty()) {
         cout << "Vector is empty." <<  endl;
        return;
    }
     cout << "Vector elements: ";
    for (int value : vec) {
         cout << value << " ";
    }
     cout <<  endl;
}

int main() {
     vector<int> myVector;

    addElement(myVector, 10);
    addElement(myVector, 20);
    addElement(myVector, 30);
    addElement(myVector, 20); // Add a duplicate for testing deletion by value

    displayVector(myVector);

    deleteElementByValue(myVector, 20);
    displayVector(myVector);

    deleteElementByIndex(myVector, 0); // Delete the element at index 0
    displayVector(myVector);

    deleteElementByIndex(myVector, 5); // Attempt to delete at an invalid index
    displayVector(myVector);

    return 0;
}
