package in.cdac;

import java.util.Scanner;

public class DataOperations {

    static Scanner sc = new Scanner(System.in);

    static String name;
    static String address;
    static int age;
    static boolean gender;
    static float basicSalary;

    public static void acceptData() {

        sc.nextLine();

        System.out.println("Enter Name: ");
        name = sc.nextLine();
        if(name == null || name.equals("") || name.length()<2)	//validation
			name = "Default";
        
        System.out.println("Enter Address: ");
        address = sc.nextLine();
        if(address == null || address.equals("") || address.length()<2)	//validation
			address = "CDAC Acts, Pashan";
        
        System.out.println("Enter Age: ");
        age = sc.nextInt();
		if(age<18 || age>58)		//validation
			age=21;
		
        System.out.println("Enter Gender: ");
        gender = sc.nextBoolean();
        System.out.println("Enter Basic Salary: ");
        basicSalary = sc.nextFloat();
		if(basicSalary < 0)		//validation
			basicSalary = 12000.0F;
    }
    
}