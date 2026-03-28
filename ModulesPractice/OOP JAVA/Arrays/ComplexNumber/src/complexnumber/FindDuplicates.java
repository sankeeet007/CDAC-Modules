package complexnumber;

import java.util.Scanner;
import java.util.Arrays;

public class FindDuplicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Invalid size.");
            scanner.close();
            return;
        }

        int[] numbers = new int[size];

        // 2. Input elements
        System.out.println("Enter " + size + " numeric elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // 3. Sort the array to bring duplicates together
        Arrays.sort(numbers);

        System.out.println("\nDuplicate values in the array are:");
        boolean foundDuplicate = false;

        // 4. Check for duplicates in the sorted array
        for (int i = 0; i < size - 1; i++) {
            // Check if current element is same as next
            if (numbers[i] == numbers[i + 1]) {
                System.out.print(numbers[i] + " ");
                foundDuplicate = true;

                // Important: Skip all subsequent identical elements 
                // so the same duplicate isn't printed multiple times
                while (i < size - 1 && numbers[i] == numbers[i + 1]) {
                    i++;
                }
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicate values found.");
        }

        System.out.println();
        scanner.close();
    }
}