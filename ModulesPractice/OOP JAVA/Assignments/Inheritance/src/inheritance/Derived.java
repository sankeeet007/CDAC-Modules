package inheritance;

public class Derived extends Base {
	public void print() {
		super.print();
		System.out.println("This is child class");
	}
}