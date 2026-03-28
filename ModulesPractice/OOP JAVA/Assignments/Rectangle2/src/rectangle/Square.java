package rectangle;

public class Square extends Rectangle {
	int side;
	
	public Square(int len, int bre, int s) {
		super(len, bre);
		this.side = s;
	}
	
	public int printarea() {
		return side*side;
	}
	
	public int printperimeter() {
		return 4*side;
	}
}
