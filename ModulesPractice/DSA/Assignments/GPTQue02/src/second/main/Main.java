package second.main;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import second.customexceptions.InvalidMarksException;
import second.model.Student;
import second.service.*;
import second.util.FileUtil;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StudentService service = new StudentServices();
		
		// Load 
		List<Student> loaded = FileUtil.load();
		loaded.forEach(service::addStudent);
		
		int studentIdCounter = loaded.size() + 1;
		int choice;
		try {
		do {
			System.out.println("1. Add\n"
							 + "2. Remove\n"
							 + "3. Display All\n"
							 + "4. Display Topper\n"
							 + "5. Save\n"
							 + "6. Exit");
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			
			switch(choice) {
				case 1:
						System.out.println("Enter Name: ");
						String name = scanner.next();
						
						System.out.println("Enter course: ");
						String course = scanner.next();
						
						System.out.println("Enter Marks: ");
						int marks = scanner.nextInt();
						if(marks < 0 && marks > 100) throw new InvalidMarksException("Marks should be between 0 to 100");
						
						Student s = new Student(studentIdCounter++, name, course, marks, LocalDate.now());
						service.addStudent(s);
						
					break;
					
				case 2:
						System.out.println("Enter Student ID to remove");
						int id = scanner.nextInt();
						service.removeStudent(id);
						
					break;
					
				case 3:
						service.listStudents();
						
					break;
					
				case 4:
						service.displayTopper(service.getAll());
						
					break;
					
				case 5:
						FileUtil.save(service.getAll());
						
					break;
					
				case 6:
						System.out.println("Exiting....");
					break;
					
				default:
						System.out.println("Invalid Input!");
			}
			
			
		}while(choice != 6);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		scanner.close();
	}
}
