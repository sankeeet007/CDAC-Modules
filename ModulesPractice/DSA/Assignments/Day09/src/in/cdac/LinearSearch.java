package in.cdac;

import java.util.Scanner;

public class LinearSearch {
	public static boolean findUsingLinearSearch(int[] arr, int element) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == element)	return true;
		}
		return false; 
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Enter element to be searched: ");
		int data = scanner.nextInt();
		
		
		System.out.println(findUsingLinearSearch(arr, data));
		
		scanner.close();
	}

}
