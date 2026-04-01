package in.cdac;

import java.util.function.BiFunction;

// Lambda expression to accept 2 strings and return the concatenated value of the same
public class Program8 {

	public static void main(String[] args) {
		
		String str1 = "Hard ";
		String str2 = "Work";
		
		BiFunction<String, String, String> concateStr = (s1, s2) -> s1 + s2;
		
		System.out.println("Concatenated String: " + concateStr.apply(str1, str2));
	}

}
