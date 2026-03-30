package in.cdac;

import in.cdac.LinkedList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int choice;
		LinkedList<Integer> list = new LinkedList<>();
		
		System.out.println("Enter 10 ineteger values to the list: ");
		for(int i=0; i<10; i++) {
			list.add(scanner.nextInt());
		}
		do {
			
			System.out.println("1. Display all the numbers\r\n"
					+ "2. Display the Highest Number\r\n"
					+ "3. Display the Lowest Number\r\n"
					+ "4. Display the Total Sum of all the numbers\r\n"
					+ "5. Display the average of all the numbers\r\n"
					+ "6. Take a number input and find the index position of that number in the list.\r\n"
					+ "7. Take an input number and find the number of times this number has been repeated in the list.\r\n"
					+ "8. Exit ");
			System.out.println("Enter your Choice: ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
					//Display all the numbers
					for(int i=0; i<10;i++) {
					System.out.println(list.get(i));
					}
				break;

			case 2:
				//Display the Highest Number
				int highest = Integer.MIN_VALUE;
				
				for(int i=0; i<10;i++) {
					int tmp = list.get(i);
					if(tmp>highest) {
						highest = tmp;
					}
				}
				System.out.println("The Highest Number is: "+ highest);
			break;
			
			case 3:
				//Display all the Lowest Number
				int lowest = Integer.MAX_VALUE;
				for(int i=0; i<10;i++) {
					int tmp = list.get(i);
					if(tmp<lowest) {
						lowest=tmp;
					}
				}
				System.out.println("The Lowest Number is: "+ lowest);
			break;
			
			case 4:{
				//Display all the Total Sum of all the numbers
				int sum=0;
				for(int i=0; i<10;i++) {
					sum += list.get(i);
				}
				System.out.println("The Total Sum of all the numbers is: "+ sum);
			break;
			}
			case 5:{
				//Display all the average of all the numbers
				int sum=0;
				for(int i=0; i<10;i++) {
					sum+=list.get(i);
				}
				System.out.println("The average of all the numbers is: "+(float)(sum/10));
			break;
			}
			case 6:{
				//Take a number input and find the index position of that number in the list
				System.out.println("Enter the index position you want to check: ");
				int i;
				int indexPos = scanner.nextInt();
				for(i=0; i<indexPos-1;i++);
				System.out.println("The value at index "+ indexPos + " is: " + list.get(i));
			break;
			}
			case 7:
				//Display take an input number and find the number of times this number has been repeated in the list.
				Integer counter=0;
				System.out.println("Enter the number you want to check frequency: ");
				int number = scanner.nextInt();
				for(int i=0; i<10;i++) {
					if(number == list.get(i)) {
						counter++;
					}
				}
				System.out.println("The Number "+ number + " repeated " + counter + " times.");
			break;
			
			case 8:
				//Exiting
				System.out.println("Exiting........");
			break;
			
			default:
				System.out.println("Invalid Input");
				break;
			}
			
		}while(choice!=8);
		
		scanner.close();
	}
}
