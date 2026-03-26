package student;

public class MainProgram {

	public static void main(String[] args) {
	
		StudentMain s1 = new StudentMain();
		s1.name = "Sam";
		s1.roll_no = 1;
		s1.phone_no = "9876543210";
		s1.address = "abc";
		
		System.out.println(s1.display());
		System.out.println("-----------------------------------------");
		
		StudentMain s2 = new StudentMain();
		s2.name = "John";
		s2.roll_no = 2;
		s2.phone_no = "1234567890";
		s2.address = "xyz";
		
		
		System.out.println(s2.display());
	}

}
