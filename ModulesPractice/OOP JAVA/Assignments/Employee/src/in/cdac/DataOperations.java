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
        System.out.println("Enter Address: ");
        address = sc.nextLine();
        System.out.println("Enter Age: ");
        age = sc.nextInt();
        System.out.println("Enter Gender: ");
        gender = sc.nextBoolean();
        System.out.println("Enter Basic Salary: ");
        basicSalary = sc.nextFloat();
    }
    
    public static float calculateTotalSalary(Employee emp) {

        float total = emp.getBasicSalary();

        if(emp instanceof Manager) {

            Manager obManager = (Manager) emp;
            total += obManager.getHra();

        }
        else if(emp instanceof SalesPerson) {

            SalesPerson obSalesPerson = (SalesPerson) emp;
            total += obSalesPerson.getCommission();

        }
        else if(emp instanceof Engineer) {

            Engineer obEngineer = (Engineer) emp;
            total += obEngineer.getOverTime();

        }

        return total;
    }
    
    
}