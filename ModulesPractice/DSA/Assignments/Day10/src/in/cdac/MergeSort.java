package in.cdac;

public class MergeSort {
	private static int[] mergedArray;
	static private void merge(int[] arr, int startPos1, int endPos1, int startPos2, int endPos2) {
		int i1 = startPos1;
		int i2 = startPos2;
		int r = 0;
		
		while ((i1 <= endPos1) && (i2 <= endPos2)) {
			if (arr[i1] < arr[i2]) {
				mergedArray[r] = arr[i1];
				i1 = i1 + 1;
			} else {
				mergedArray[r] = arr[i2];
				i2 = i2 + 1;
			}
			r = r + 1;
		}
		while (i1 <= endPos1) {
			mergedArray[r] = arr[i1];
			i1 = i1 + 1;
			r = r + 1;
		}
		while (i2 <= endPos1) {
			mergedArray[r] = arr[i2];
			i2 = i2 + 1;
			r = r + 1;
		}

		int i = startPos1;
		int j = 0;
		while (j < r) {
			arr[i] = mergedArray[j];
			i = i + 1;
			j = j + 1;
		}
	}
	static private void mergeSort(int[] arr, int startPos, int endPos) {
		System.out.println("MergeSort - " + startPos + " - " + endPos);
		if ((endPos - startPos + 1) <= 1) {
			return;
		}
		
		int middlePos = startPos + (endPos - startPos) / 2;
		mergeSort(arr, startPos, middlePos);
		mergeSort(arr, middlePos + 1, endPos);

		merge(arr, startPos, middlePos, middlePos + 1, endPos);
	}
	static public void mergeSort(int[] arr) {
		mergedArray = new int[arr.length];
		mergeSort(arr, 0, arr.length - 1);
	}
}
