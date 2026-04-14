package in.cdac;

import java.util.Scanner;

public class IsSorted {
	
	public static void bubbleSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static boolean isArraySorted(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = {5,8,6,7,2,3,9,1};
		System.out.println("Original array: ");
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(isArraySorted(arr));
		bubbleSort(arr);
		System.out.println("Sorted array: ");
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(isArraySorted(arr));
		
		scanner.close();
	}

}
