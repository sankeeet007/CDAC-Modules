package first.services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import first.CustomExceptions.RecordNotFoundException;
import first.model.Enrollment;

public class EnrollmentServices implements EnrollmentService {
	List<Enrollment> list = new ArrayList<>();
	
	@Override
	public void addEnrollment(Enrollment e) {
		list.add(e);
	}

	@Override
	public void removeEnrollment(int id) throws RecordNotFoundException{
		boolean found = list.removeIf(e -> e.getId() == id);
		
		if(!found) {
			throw new RecordNotFoundException("Enrollment ID " + id + " Not Found");
		}
	}

	@Override
	public void listEnrollments() {
		Consumer<Enrollment> printer = str -> System.out.println(str.toString());
		list.forEach(printer);
	}

	@Override
	public List<Enrollment> getAll() {
		
		return list;
	}

}
