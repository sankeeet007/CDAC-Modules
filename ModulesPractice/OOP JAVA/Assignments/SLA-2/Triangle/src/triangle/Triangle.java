package triangle;

public class Triangle {
	int s1, s2, s3;
	public Triangle(int side1, int side2, int side3) {
		s1 = side1;
		s2 = side2;
		s3 = side3;
	}
	
	public double area() {
		float s = (s1+s2+s3)/2;
		return Math.sqrt(s*((s-s1)*(s-s2)*(s-s3)));
	}
	
	public int perimeter() {
		return (s1+s2+s3);
	}
}
