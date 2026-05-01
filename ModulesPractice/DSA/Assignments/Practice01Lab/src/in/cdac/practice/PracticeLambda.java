package in.cdac.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.*;
public class PracticeLambda {
	public static void main(String[] args) {
		System.out.println("+++++++++++++++ IN MAIN +++++++++++++");
		
		ArrayList<String> list = new ArrayList<>();
		String[] liStrings = {"Anna", "Bob", "Alexander", "Chris"};
		List<String> messages = Arrays.asList("hello", "java is fun", "lambda power");
		
		
		
		List<Integer> prices = Arrays.asList(10, 50, 100, 250);
		list.addAll(Arrays.asList(liStrings));
		
		Predicate<String> filernames = names -> names.startsWith("A");
		System.out.println("Names starts with A:");
		list.stream()
			.filter(filernames)
			.forEach(System.out::println);
		
		Function<Integer, String> dataTypeChangeFunction = price -> "$" + price;
//		System.out.println(dataTypeChangeFunction.apply(100));
		System.out.println("Formatted Strings:");
		for(Integer p: prices) {
			System.out.println(dataTypeChangeFunction.apply(p));
		}
		
		
		Consumer<String> printer = str -> System.out.println(str.toUpperCase());
		messages.forEach(printer);
		
		
		// Predicate
		Predicate<Integer> checkEven = (num) -> num%2==0;
		System.out.println(checkEven.test(16));
		
		Predicate<String> LengthofString = (str) -> str.length()==6;
		System.out.println(LengthofString.test("sanket"));
		
		
		// Function
		Function<String, Integer> stringLength = (s) -> s.length();
		System.out.println(stringLength.apply("Java")); // Output: 4
				
		Function<String, Integer> stringLength1 = (s) -> s.length();
		System.out.println(stringLength1.apply("Sanket"));
		
		
		// Consumer
		Consumer<String> printerConsumer = (str) -> System.out.println("String" + str);
		printerConsumer.accept(" sanket");
				
		// Supplier
		Supplier<Double> randomVal = () -> Math.random();
		System.out.println(Math.floor(10*randomVal.get()));
		
		
		
		
		
		
		
		
	}
}
