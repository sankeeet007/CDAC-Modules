package second.service;

import java.util.List;

import second.customexceptions.StudentNotFoundException;
import second.model.Student;

public interface StudentService {
	public void addStudent(Student s);
	public void removeStudent(int id) throws StudentNotFoundException;
	public void listStudents();
    List<Student> getAll();
	
	public default void displayTopper(List<Student> list){
		System.out.println("Topper: ");
		Student topper = null;
		int max = 0;
		for(Student student : list) {
			if(student.getMarks() > max) {
				topper = student;
			}
		}
		System.out.println(topper.toString());
	}
}
