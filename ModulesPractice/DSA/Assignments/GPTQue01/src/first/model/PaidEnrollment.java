package first.model;

import java.time.LocalDate;

public class PaidEnrollment extends Enrollment {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PaidEnrollment(int id, String name, CourseType course, LocalDate date, double fee) {
		super(id, name, course, date, fee);
	}

	@Override
	public double calculateFinalFee() {
		if(course == CourseType.CERTIFICATION)
			return fee + 500;
		return fee;
	}
	
}
