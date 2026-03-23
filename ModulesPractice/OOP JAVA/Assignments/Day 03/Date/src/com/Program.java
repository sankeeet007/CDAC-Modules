package com;
import java.util.*;

public class Program {

	public static void main(String[] args) {
		int day, month, year, choice;
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Day: ");
		day = sc.nextInt();
		System.out.println("Enter Month: ");
		month = sc.nextInt();
		System.out.println("Enter Year: ");
		year = sc.nextInt();
		Date d1 = new Date(day, month, year);
		
		do {
			System.out.println("1. Set a new Date\n2. Add days\n3. Add Month\n4. Add Year\n5. Compare Date\n6. Display Date\n7. Exit");
			choice = sc.nextInt();
			
			switch(choice) 
			{
				case 1:	System.out.println("Enter Day: ");
						day = sc.nextInt();
						System.out.println("Enter Month: ");
						month = sc.nextInt();
						System.out.println("Enter Year: ");
						year = sc.nextInt();
						d1 = new Date(day, month, year);
						break;
						
				case 2:	System.out.println("Enter how many days you want to add: ");
						int daysToAdd = sc.nextInt();
						d1.addDays(daysToAdd);
						break;
						
				case 3:	System.out.println("Enter how many months you want to add: ");
						int monthsToAdd = sc.nextInt();
						d1.addMonths(monthsToAdd);
						break;
						
				case 4: System.out.println("Enter how many Years you want to add: ");
						int yearsToAdd = sc.nextInt();
						d1.addYears(yearsToAdd);
						break;
					
				case 5:	System.out.println("Enter Day: ");
						day = sc.nextInt();
						System.out.println("Enter Month: ");
						month = sc.nextInt();
						System.out.println("Enter Year: ");
						year = sc.nextInt();
						Date d2 = new Date(day, month, year);
						System.out.println("Dates are "+((d1.compareDates(d2))?"Same":"Different"));
						
						break;
						
				case 6:	d1.displayDate();
						break;
						
				case 7: System.out.println("Exiting.............");
						break;
						
				default: System.out.println("Enter valid Input");
						break;
	
			}
			
		}while(choice!=7);
		
		sc.close();
	}

}
