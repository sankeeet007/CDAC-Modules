import java.util.Scanner;
import java.util.Arrays;

public class DuplicatesinArray {
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
		int[] duplicates = new int[size];
		int d_index = 0;
		
        System.out.println("Enter " + size + " numeric elements:");
		
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
		
		for(int i=0; i<size-1; i++){
			for(int j=i+1; j<size; j++){
				if(numbers[i]==numbers[j]){
					duplicates[d_index++] = numbers[i];
					break;
				}
			}
		}
		System.out.println("Duplicates are: ");
		for (int i = 0; i < duplicates.length; i++) {
			System.out.print(duplicates[i] + "  ");
        }

        sc.close();
    }
}