package in.cdac;

import java.util.ArrayList;
import java.util.Arrays;

// Lambda expression to sort a string array in alphabetical order
public class Porgram1 {
	
	public static void main(String[] args) {
		ArrayList<String> colorString = new ArrayList<>(Arrays.asList("Red","Blue","Green","Yellow","Pink","Orange","Purple"));
		
		colorString.sort((str1, str2)-> str1.compareTo(str2));
		
		System.out.println(colorString);
	}

}
