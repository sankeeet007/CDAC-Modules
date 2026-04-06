package in.cdac;

import java.util.Scanner;


public class Program01 {

	 public static int deleteFromPosition(int[] arr, int n, int pos) {
		 if(pos < 0 || pos > n) {
			 System.out.println("Invalid Position!!!");
		 }
		 
		 for(int i=pos; i<n-1; i++) 
		 {
			 arr[i] = arr[i+1];
		 }
		 return --n;
	 }
	 
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in))
		{
			//int []arr = {10,20,30,45,55};
			int []arr;
			System.out.println("Enter size for array: ");
			int n = scanner.nextInt();
			arr = new int[n];
			System.out.println("Enter "+ n +" Elements in the array: " );
			
			for(int i=0; i<n; i++) {
				arr[i] = scanner.nextInt();
			}
			
			System.out.println("Enter the position to be deleted: ");
			int pos = scanner.nextInt();
			
			System.out.println("Before Operation: ");
			for(int i = 0; i < n; i++) 
			{
				System.out.println(arr[i]);
			}
			
			n =	deleteFromPosition(arr, arr.length, pos);
			
			System.out.println("After Operation: ");
			for(int i = 0; i < n; i++) 
			{
				System.out.println(arr[i]);
			}
			
		}
	}
}
