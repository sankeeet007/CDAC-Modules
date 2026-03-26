package employee;

public class MainProgram {

	public static void main(String[] args) {
		
		System.out.println("Name\tYear of joining\t\tAddress");
		
		Employee objEmployee1 = new Employee("Robert", "1994", "64C-WallsStreat");
		objEmployee1.display();
		Employee objEmployee2 = new Employee("Sam", "2000", "68D-WallsStreat");
		objEmployee2.display();
		Employee objEmployee3 = new Employee("John", "1999", "26B-WallsStreat");
		objEmployee3.display();
	}

}
