package rectangle;

public class Rectangle {
	int len, bre;
	public Rectangle(int length, int breadth) {
		len = length;
		bre = breadth;
	}
	public int area() {
		return len*bre;
	}
}
