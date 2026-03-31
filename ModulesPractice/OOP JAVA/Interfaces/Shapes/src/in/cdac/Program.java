package in.cdac;

import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String args[]) {
		try(Scanner scanner = new Scanner(System.in)){
		int choice, indexCounter=0;
		RegularPolygon[] shapes = new RegularPolygon[100];
		
		
			do {
					System.out.println("1. Add shape: (Equilateral Triangle)\n"
							+ "2. Add shape: (Square)\n"
							+ "3. Display Number of total sides in the array\n"
							+ "4. Display Specs of each shape\n"
							+ "5. Exit");
					System.out.println("Enter your choice: ");
					choice = scanner.nextInt();
					
					switch(choice) {
					case 1: {
							System.out.println("Enter side length for the Equilateral Triangle: ");
							int len = scanner.nextInt();
							shapes[indexCounter++] = new EquilateralTriangle(len);
						break;
					}
					case 2:{
						System.out.println("Enter side length for the Square: ");
						int len = scanner.nextInt();
						shapes[indexCounter++] = new Square(len);
						break;
					}
					case 3: {
						System.out.println("Number of total sides in array: " + RegularPolygon.totalSides(shapes));
						break;
					}
					case 4: {
						System.out.println("Specs of Each shape:");
						System.out.println("---------------------------");
						
						for(int i=0; i<indexCounter; i++) {
							RegularPolygon shape = shapes[i];
							String type = (shape instanceof EquilateralTriangle) ? "Triangle" : "Square";
							
							System.out.println("Shape type: " + type);
							System.out.println("Sides: " + shape.getNumSides());
							System.out.println("Side Length: " + shape.getSideLength());
							System.out.println("Perimeter: " + shape.getPerimeter());
							int degree = (int) Math.ceil(Math.toDegrees(shape.getInteriorAngle()));
							System.out.println("Interior Angle: " + degree);
							System.out.println("---------------------------");	
						}
						break;
					}
					case 5: {
							//Exit
							System.out.println("Exiting.........");
						break;
					}
					default: {
								throw new IOException("Invalid Choice" + choice);
					}
					}
			}while(choice!=5);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
