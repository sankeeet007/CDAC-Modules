package student;

public class StudentMain {
	String name;
	int roll_no;
	String phone_no;
	String address;
	
	
	public String display(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("Name of Student "+roll_no+":"+name+"\n");
		buffer.append("Address of Student "+roll_no+":"+address+"\n");
		buffer.append("Phone no of Student "+roll_no+":"+phone_no+"\n");
		return buffer.toString();
	}
}
