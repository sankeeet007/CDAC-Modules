#include <iostream>
#include <string>
#include <cctype> // for isalpha and tolower

using namespace std;

int main() {
    string input;
    int vowels = 0, consonants = 0;

    cout << "Enter a line of text: ";
    getline(cin, input);

    cout << "Processed String: ";
    for (char c : input) {
        // Terminate if character is NOT an alphabet and NOT a space
        if (!isalpha(c) && c != ' ') {
            break;
        }

        cout << c; 

        if (isalpha(c)) {
            char lowC = tolower(c);
            if (lowC == 'a' || lowC == 'e' || lowC == 'i' || lowC == 'o' || lowC == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
    }

    cout << "\n\n--- Results ---" << endl;
    cout << "Vowels: " << vowels << endl;
    cout << "Consonants: " << consonants << endl;

    return 0;
}
