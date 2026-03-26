package complex;

import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter real part for first number: ");
		double r1 = sc.nextDouble();
		System.out.println("Enter imag part for first number: ");
		double i1 = sc.nextDouble();
		Complex c1 = new Complex(r1, i1);
		
		System.out.println("Enter real part for second number: ");
		double r2 = sc.nextDouble();
		System.out.println("Enter real part for second number: ");
		double i2 = sc.nextDouble();
		Complex c2 = new Complex(r2, i2);
		
		Complex sumComplex = Complex.sum(c1, c2);
		Complex diffComplex = Complex.diff(c1, c2);
		Complex productComplex = Complex.product(c1, c2);
		
		System.out.print("Sum: ");
        sumComplex.display();
        System.out.print("Difference: ");
        diffComplex.display();
        System.out.print("Product: ");
        productComplex.display();
        
        sc.close();
	}

}
