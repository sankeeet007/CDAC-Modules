package in.cdac;

import java.util.function.Function;

public class ReverseInteger {

	public static void main(String[] args) {
			
			int number = 34567;
			
			Function<Integer, Integer> reveseFunction = (num) ->{
					int rev = 0;
					
					while(num != 0) {
						int rem = num%10;
						rev = rem + (rev*10);
						num = (num/10);
					}
					return rev;
			};
			System.out.println("Original: " + number
							 + " Reversed: " + reveseFunction.apply(number));

	}

}
