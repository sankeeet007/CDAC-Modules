import java.util.Scanner;
import java.util.Arrays;

public class MaxMinofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();


        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numeric elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
		
		//MIN AND MAX_VALUE
		for(int i=0;i<size;i++){
			//max
			if(numbers[i]>max){
				max=numbers[i];
			}
			//min
			if(numbers[i]<min){
				min=numbers[i];
			}
		}
		
		System.out.println("Max is: " +max);
		System.out.println("Min is: " +min);

        

        sc.close();
    }
}