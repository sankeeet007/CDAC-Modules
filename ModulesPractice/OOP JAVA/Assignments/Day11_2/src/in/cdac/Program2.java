package in.cdac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiFunction;

// Lambda expression to find the largest number in an integer array.

public class Program2 {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(21,34,55,64,99,76,45));
		
		BiFunction<Integer,Integer,Integer> Max = (i1, i2) -> (i1 > i2) ? i1 : i2;
		int maximum = Integer.MIN_VALUE;
		
		for(int i=0; i<arrayList.size()-1; i++) {
			maximum = Max.apply(maximum,arrayList.get(i));
		}
		System.out.println("Maximum number is: " + maximum);
	}

}
