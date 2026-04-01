package in.cdac;

import java.util.function.Supplier;

// Lambda expression to generate a 3 digit random number
public class Program4 {

	public static void main(String[] args) {
		StringBuffer sBuffer = new StringBuffer("");
		Supplier<String> randomNumber = () -> {
			for(int i=0; i<3; i++) {
			sBuffer.append((int)(Math.random()*10));
			}
			return sBuffer.toString();
		};
		
		System.out.println("3 Digit Random Number: " + randomNumber.get());
	}

}
