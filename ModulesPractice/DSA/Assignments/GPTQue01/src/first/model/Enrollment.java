package first.model;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Enrollment implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int id; 
	protected String name;
	protected CourseType course;
	protected LocalDate date;
	protected double fee;
	
	public Enrollment(int id,String name,CourseType course,LocalDate date,double fee) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.date = date;
		this.fee = fee;
	}

	public int getId() { return id;	}

	public CourseType getCourse() { return course; }

	public LocalDate getDate() { return date; }

	public double getFee() { return fee; }

	public abstract double calculateFinalFee();

	@Override
	public String toString() {
		return "Enrollment [id=" + id + ", name=" + name + ", course=" + course + ", date=" + date + ", fee=" + fee
				+ "]";
	}
	
	
	
}
