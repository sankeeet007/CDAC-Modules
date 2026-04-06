package in.cdac;

import java.util.Scanner;
import java.util.function.Predicate;

// Lambda expression to evaluate if a number entered is a Prime number

public class Program7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		
		Predicate<Integer> isPrimePredicate = (num) ->{
			for(int i=2; i<num/2; i++) {
				if(num % i == 0){
					return false;
				}
			}
			return true;
		};
		
		System.out.println("The number "+ number + " is " + ((isPrimePredicate.test(number)) ? "Prime" : "Not Prime"));
		scanner.close();
	}

}
