package first.services;


import java.util.List;

import first.CustomExceptions.RecordNotFoundException;
import first.model.Enrollment;

public interface EnrollmentService {
	public void addEnrollment(Enrollment e);
	public void removeEnrollment(int id) throws RecordNotFoundException;
	public void listEnrollments();
	
	List<Enrollment> getAll();
	
	// Default method
	public default void displaySummary(List<Enrollment> list) {
		System.out.println("Total enrollments and count per course type:");
		int free = 0, certification = 0, paid = 0;
		
		for(Enrollment e: list) {
			switch(e.getCourse()) {
			case FREE : free++;	break;
			case PAID : paid++;	break;
			case CERTIFICATION : certification++;	break;
			}
		}
		
		System.out.println("FREE: " + free);
		System.out.println("PAID: " + paid);
		System.out.println("CERTIFICATION: " + certification);
	}

}
