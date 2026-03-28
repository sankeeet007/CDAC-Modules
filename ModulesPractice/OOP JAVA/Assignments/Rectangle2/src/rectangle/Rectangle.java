package rectangle;

public class Rectangle {
	int length, breadth;
	
	public Rectangle(int len, int bre) {
		length = len;
		breadth = bre;
	}
	
	public int printarea() {
		return length*breadth;
	}
	
	public int printperimeter() {
		return 2*(length+breadth);
	}
	
}
