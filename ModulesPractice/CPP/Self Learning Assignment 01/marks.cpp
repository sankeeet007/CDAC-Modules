#include <iostream>
using namespace std;

void inputGrades(int grades[], int size) {
    for (int i = 0; i < size; i++) {
        cout << "Enter marks:  " << i + 1 << " (0-100): ";
        cin >> grades[i];
        while (grades[i] < 0 || grades[i] > 100) {
            cout << "Invalid input. Please enter a mark between 0 and 100: ";
            cin >> grades[i];
        }
    }
}

double calculateAverage(int grades[], int size) {
    double sum = 0;
    for (int i = 0; i < size; i++) {
        sum += grades[i];
    }
    return sum / size;
}

int countFailingMarks(int grades[], int size) {
    int count = 0;
    for (int i = 0; i < size; i++) {
        if (grades[i] < 65) {
            count++;
        }
    }
    return count;
}

int main() {
    const int SIZE = 5;
    int grades[SIZE];
    cout << "--- Grade Analysis System ---" << endl;

    inputGrades(grades, SIZE);

    double average = calculateAverage(grades, SIZE);
    int below65 = countFailingMarks(grades, SIZE);

    cout << "\n--- Results ---" << endl;
    cout << "Average Marks: " << average << endl;
    cout << "Number of marks less than 65: " << below65 << endl;
    return 0;
}
