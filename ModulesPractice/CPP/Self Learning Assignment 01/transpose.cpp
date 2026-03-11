#include <iostream>
using namespace std;
int main() {
    // Define a maximum size for the matrices
    int rows, cols;
    int matrix[10][10], transpose[10][10];

    // 1. Input Dimensions
    cout << "Enter rows and columns (max 10): ";
    cin >> rows >> cols;

    // 2. Input Matrix Elements
    cout << "\nEnter elements of the matrix:\n";
    for (int i = 0; i < rows; ++i) {
        for (int j = 0; j < cols; ++j) {
            cout << "Enter element [" << i << "][" << j << "]: ";
            cin >> matrix[i][j];
        }
    }

    // 3. Logic: Transpose the Matrix
    // The element at [i][j] moves to [j][i]
    for (int i = 0; i < rows; ++i) {
        for (int j = 0; j < cols; ++j) {
            transpose[j][i] = matrix[i][j];
        }
    }

    // 4. Display Original Matrix
    cout << "\n--- Original Matrix ---\n";
    for (int i = 0; i < rows; ++i) {
        for (int j = 0; j < cols; ++j) {
            cout << matrix[i][j] << "  ";
        }
        cout << "\n";
    }

    // 5. Display Transposed Matrix
    // Note: The loop now goes up to 'cols' for rows and 'rows' for columns
    std::cout << "\n--- Transposed Matrix ---\n";
    for (int i = 0; i < cols; ++i) {
        for (int j = 0; j < rows; ++j) {
            cout << transpose[i][j] << "  ";
        }
        cout << "\n";
    }

    return 0;
}
