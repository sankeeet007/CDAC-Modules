package second.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import second.customexceptions.StudentNotFoundException;
import second.model.Student;

public class StudentServices implements StudentService{

	private List<Student> list = new ArrayList<>();
	
	@Override
	public void addStudent(Student s) {
		list.add(s);
		
	}

	@Override
	public void removeStudent(int id) throws StudentNotFoundException{
		boolean found = list.removeIf(s -> s.getStudentID() == id);
		if(!found) throw new StudentNotFoundException("Student id "+id + " Not Found.");
		
	}

	@Override
	public void listStudents() {
		Consumer<Student> printer = str -> System.out.println(str.toString());
		list.forEach(printer);
	}

	@Override
	public List<Student> getAll() {
		return list;
	}
}

