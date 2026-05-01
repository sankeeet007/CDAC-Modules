package cdac.Sorting;

class MergeSort {
	public static void ArrayPrinter(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}
	public static void mergeSort(int[] arr, int si, int ei) {
		if(si >= ei) return;
		int mid = si + (ei - si)/2;		// Finding Mid for each divide
		mergeSort(arr, si, mid);			// Left Part
		mergeSort(arr, mid+1, ei);			// Right Part
		
		merge(arr, si, mid, ei);
	}
	private static void merge(int[] arr, int si, int mid, int ei) {
		int[] tmp = new int[ei-si+1];
		int i = si;      // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0;       // iterator for tmp
		
		// comparing and sorting each sub problem
		while(i <= mid && j <= ei) {
			if(arr[i] < arr[j]) {
				tmp[k++] = arr[i++];
			}
			else {
				tmp[k++] = arr[j++];
			}
		}
		
		// Managing leftovers from 1st of sorted part
		while(i<=mid) {
			tmp[k++] = arr[i++]; 
		}
		
		// Managing leftovers from 2nd of sorted part
		while(j<=ei) {
			tmp[k++] = arr[j++]; 
		}
		
		// Copying tmp array to Original Array
		for(i = si, k = 0; k < tmp.length; k++, i++) {
			arr[i] = tmp[k];
		}
	}
	public static void main(String[] args) {
		int[] arr = {5,3,2,6,8,4,9};
		
		mergeSort(arr, 0, arr.length-1);
		ArrayPrinter(arr);
	}
}
