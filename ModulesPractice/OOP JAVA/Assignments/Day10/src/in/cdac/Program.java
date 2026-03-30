package in.cdac;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Program {
	public static void Main(String[] args) {
		int choice;

		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> empArrayList = new ArrayList<>();
		LinkedList<Employee> empLinkedList = new LinkedList<>();
		ArrayList<Integer> salary = new ArrayList<Integer>();
		ArrayList<String> name = new ArrayList<String>();

		do {
			System.out.println(
					"1)Add \n2)Transfer into ArrayList to LinkedList \n3)diaplay \n4)Sort salary \n5)Sort name \n6)exit");
			System.out.print("Enter choice:");
			choice = sc.nextInt();

			switch (choice) {
			case 1: {
				int choiceAdd;
				do {

					System.out.println("1)Add into ArrayList \n2)Add into LinkedList \n3)exit");
					System.out.println("Enter choice:");
					choiceAdd = sc.nextInt();
					switch (choiceAdd) {
					case 1: {
						addEmpArrayList(empArrayList, sc);
						break;
					}
					case 2: {
						addEmpLinkedList(empLinkedList, sc);
						break;

					}

					default:
						break;
					}

				} while (choiceAdd != 3);
				break;
			}
			case 2: {
				transferArrayListToLinkedList(empArrayList.iterator(), empLinkedList);
			}
			case 3: {
				int choiceDisplay = 0;
				do {
					System.out.println("1)Display LinkedList \n2)Display ArrayList \n3)exit");
					System.out.println("Enter choice:");
					choiceDisplay = sc.nextInt();

					switch (choiceDisplay) {
					case 1: {
						displayLinkedList(empLinkedList.iterator());
						break;
					}

					case 2: {
						displayArrayList(empArrayList.iterator());
						break;
					}

					default:
						break;
					}
				} while (choiceDisplay != 3);
				break;

			}
			case 4: {
				sortSalary(salary, empArrayList.iterator());
				break;
			}
			case 5: {
				sortName(name, empArrayList.iterator());
				break;
			}

			default:
				break;
			}
		} while (choice != 6);
	}

	public static void sortSalary(ArrayList<Integer> salary, Iterator<Employee> iter) {
		while (iter.hasNext()) {
			Employee objEmp = iter.next();
			salary.add(objEmp.getSalary());
		}

		Collections.sort(salary);
		System.out.println(salary);
	}

	public static void sortName(ArrayList<String> name, Iterator<Employee> iter) {
		while (iter.hasNext()) {
			Employee objEmp = iter.next();
			name.add(objEmp.getName());
		}
		Collections.sort(name);
		System.out.println(name);
	}

	public static void transferArrayListToLinkedList(Iterator<Employee> arrayIter, LinkedList<Employee> empLinkedList) {
		while (arrayIter.hasNext()) {
			Employee objEmp = arrayIter.next();
			empLinkedList.add(objEmp);
		}
	}

	public static void displayLinkedList(Iterator<Employee> iter) {
		while (iter.hasNext()) {
			Employee objEmp = iter.next();
			System.out.println("Id:" + objEmp.getEmpId());
			System.out.println("Name:" + objEmp.getName());
			System.out.println("Salary:" + objEmp.getSalary());

		}
	}

	public static void displayArrayList(Iterator<Employee> iter) {
		while (iter.hasNext()) {
			Employee objEmp = iter.next();
			System.out.println("Id:" + objEmp.getEmpId());
			System.out.println("Name:" + objEmp.getName());
			System.out.println("Salary:" + objEmp.getSalary());

		}
	}

	public static void addEmpArrayList(ArrayList<Employee> empArrayList, Scanner sc) {

		System.out.println("Enter Employee Id ");
		int id = sc.nextInt();

		System.out.println("Enter Name:");
		String name = sc.next();

		System.out.println("Enter Salary:");
		int salary = sc.nextInt();

		empArrayList.add(new Employee(id, name, salary));

	}

	public static void addEmpLinkedList(LinkedList<Employee> empLinkedList, Scanner sc) {

		System.out.println("Enter Employee Id ");
		int id = sc.nextInt();

		System.out.println("Enter Name:");
		String name = sc.next();

		System.out.println("Enter Salary:");
		int salary = sc.nextInt();

		empLinkedList.add(new Employee(id, name, salary));

	}
}
