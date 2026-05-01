package second.model;

import java.io.Serializable;
import java.time.LocalDate;


public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int studentID;
	String name;
	String course;
	int marks;
	LocalDate admissionDate;
	
	public Student(int studentID, String name, String course, int marks, LocalDate admissionDate) {
		this.studentID = studentID;
		this.name = name;
		this.course = course;
		this.marks = marks;
		this.admissionDate = admissionDate;
	}

	public int getStudentID() { return studentID; }

	public String getCourse() { return course;	}

	public LocalDate getAdmissionDate() { return admissionDate; }
	
	public int getMarks() { return marks; }
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", name=" + name + ", course=" + course + ", marks=" + marks
				+ ", admissionDate=" + admissionDate + "]";
	}

	
}
