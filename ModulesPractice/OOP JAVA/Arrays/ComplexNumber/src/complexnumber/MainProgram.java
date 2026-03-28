package complexnumber;

import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ComplexNumber[] complexArray = new ComplexNumber[5];
		
		for(int i=0; i<complexArray.length; i++) {
			System.out.println("\nEntering details for Object " + (i + 1) + ":");
			
			complexArray[i] = new ComplexNumber();
			
			System.out.print("Enter value for number1: ");
            int n1 = sc.nextInt();
            complexArray[i].setNumber1(n1);
            
            System.out.print("Enter value for number2: ");
            int n2 = sc.nextInt();
            complexArray[i].setNumber2(n2);
		}
		
		System.out.println("\n--- Multiplication Results ---");
        for (int i = 0; i < complexArray.length; i++) {
            int result = complexArray[i].computeComplexNumber();
            System.out.println("Object " + (i + 1) + " ( " + complexArray[i].getNumber1() + " * " + complexArray[i].getNumber2() + " ) = " + result);
        }

        sc.close();
	}

}
