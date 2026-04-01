package in.cdac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiFunction;

// Lambda expression to find the smallest number in an integer array.

public class Program3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(21,34,55,11,64,99,76,45));
		
		BiFunction<Integer, Integer, Integer> Min = (i1, i2) -> (i1 < i2) ? i1 : i2;
		
		int minimum = Integer.MAX_VALUE;
		for(int i=0; i<arrayList.size()-1; i++) {
			minimum = Min.apply(minimum,arrayList.get(i));
		}
		System.out.println("Minimum number is: " + minimum);
	}

}
