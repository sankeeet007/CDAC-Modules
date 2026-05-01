package first.main;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import first.CustomExceptions.InvalidEnrollmentException;
import first.model.CourseType;
import first.model.Enrollment;
import first.model.PaidEnrollment;
import first.services.EnrollmentService;
import first.services.EnrollmentServices;
import first.util.FileUtil;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		EnrollmentService service = new EnrollmentServices();
		
		// Load data
		List<Enrollment> loaded = FileUtil.load();
		loaded.forEach(service::addEnrollment);
		
		
		int choice;
		int idCounter = loaded.size() + 1;
		do {
			System.out.println("1. Add\n"
							 + "2. Remove\n"
							 + "3. Display\n"
							 + "4. Summary\n"
							 + "5. Save\n"
							 + "6. Exit");
			choice = scanner.nextInt();
			try {
				switch (choice) {
				case 1:
					System.out.println("Name: ");
					String name = scanner.next();
	
				   System.out.print("Course Type (FREE/PAID/CERTIFICATION): ");
                   CourseType type = CourseType.valueOf(scanner.next().toUpperCase());

					System.out.println("Fee: ");
					double fee = scanner.nextDouble();
					if(fee < 0) throw new InvalidEnrollmentException("Invalid Fee!");
					
					Enrollment e = new PaidEnrollment(idCounter++, name, type, LocalDate.now(), fee);
					
					service.addEnrollment(e);
					break;
					
				case 2:
					System.out.println("Enter ID to remove: ");
					int id = scanner.nextInt();
					service.removeEnrollment(id);
					break;
				
				case 3: 
					service.listEnrollments();
					break;
					
				case 4:
					service.displaySummary(service.getAll());
					break;
				case 5:
					FileUtil.save(service.getAll());
					break;
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}while(choice != 6);
		scanner.close();
	}
}
