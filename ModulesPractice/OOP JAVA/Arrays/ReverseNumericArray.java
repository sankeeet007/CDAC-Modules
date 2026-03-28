import java.util.Scanner;
import java.util.Arrays;

public class ReverseNumericArray {
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

        System.out.println("Enter " + size + " numeric elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

		int i=0;
		int j=numbers.length-1;
		while(i<j){
			int tmp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = tmp;
			i++;
			j--;
		}
		for(i=0;i<size;i++)
			System.out.println("Reversed array is: "+numbers[i]);
		
        sc.close();
    }
}