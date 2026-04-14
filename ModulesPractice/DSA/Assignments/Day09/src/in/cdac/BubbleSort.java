package in.cdac;

import java.util.Scanner;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
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
		bubbleSort(arr);
		System.out.println("Sorted array: ");
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
//		System.out.println(findUsingBinarySearch(arr, data));
		
		scanner.close();
	}
}
