package in.cdac;

import java.util.Scanner;

public class InsertionSort {
	
	public static void insertionSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int current = arr[i];
			int j = i-1;
			
			while(j>=0 && current>arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = {5,8,6,7,2,3,9,1};
		System.out.println("Original array: ");
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		insertionSort(arr);
		System.out.println("Sorted array: ");
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		scanner.close();

	}

}
