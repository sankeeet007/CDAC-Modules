import java.util.Scanner;
import java.util.Arrays;

public class SumofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Please enter a valid size greater than 0.");
            sc.close();
            return;
        }

        int[] numbers = new int[size];
		int sum = 0;
		
        System.out.println("Enter " + size + " numeric elements:");
		
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
		
		for(int i = 0; i < size; i++){
			sum += numbers[i];
		}
		
		System.out.println("\nSum of array elements: "+sum);

        sc.close();
    }
}