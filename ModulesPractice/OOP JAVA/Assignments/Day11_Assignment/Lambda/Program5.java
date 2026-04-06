package in.cdac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

// Lambda expression that takes an integer array and returns the reverse integer array
public class Program5 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(21,34,55,11,64,99,76,45));
		
		Function<ArrayList<Integer>, ArrayList<Integer>> reversedArray = (originalArray) ->{
			ArrayList<Integer> revArrayList = new ArrayList<>();
			
				for(int i=arr.size()-1; i >= 0; i--) {
					revArrayList.add(arr.get(i));
				}
				return revArrayList;
		};
		System.out.println("Reversed Array: \n" + reversedArray.apply(arr));
	}

}
