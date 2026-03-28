package complexnumber;

import java.util.Scanner;
import java.util.Arrays;

public class CommonElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input for First Array
        System.out.print("Enter the size of the first array: ");
        int size1 = sc.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = sc.nextInt();
        }

        // 2. Input for Second Array
        System.out.print("Enter the size of the second array: ");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = sc.nextInt();
        }

        // 3. Sort both arrays (helps in handling duplicates easily)
        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.println("\nCommon elements are:");
        
        int i = 0; // Pointer for array1
        int j = 0; // Pointer for array2
        boolean found = false;

        // 4. Two-pointer approach to find intersection
        while (i < size1 && j < size2) {
            if (array1[i] == array2[j]) {
                // Check if this common element was already printed to avoid duplicates
                System.out.print(array1[i] + " ");
                found = true;
                
                // Store the current matching value and skip all its duplicates in both arrays
                int currentMatch = array1[i];
                while (i < size1 && array1[i] == currentMatch) i++;
                while (j < size2 && array2[j] == currentMatch) j++;
            } 
            else if (array1[i] < array2[j]) {
                i++; // Move pointer in the first array forward
            } 
            else {
                j++; // Move pointer in the second array forward
            }
        }

        if (!found) {
            System.out.println("No common elements found.");
        }

        sc.close();
    }
}