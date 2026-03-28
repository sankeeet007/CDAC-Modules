package rectangle;

public class MainProgram {

	public static void main(String[] args) {
		Rectangle objRectangle = new Rectangle(4, 5);
		System.out.println("Area of rectangle: "+objRectangle.printarea());
		System.out.println("Perimeter of rectangle: "+objRectangle.printperimeter());
		
		Square objSquare = new Square(1, 2, 3);
		System.out.println("Area of square: "+objSquare.printarea());
		System.out.println("Perimeter of square: "+objSquare.printperimeter());

	}

}
