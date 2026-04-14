package in.cdac;

import java.util.Scanner;

public class BinarySearch {
	public static boolean findUsingBinarySearch(int[] arr, int element) {
		int start = 0;
		int end = arr.length-1;
	
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(arr[mid] == element)	return true;
			
			if(arr[mid]<element) {
					start=mid+1;
			}
			if(arr[mid]>element) {
				end=mid-1;
		}
		}
		
		return false;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Enter element to be searched: ");
		int data = scanner.nextInt();
		
		System.out.println(findUsingBinarySearch(arr, data));
		
		scanner.close();
	}

}
