package in.cdac;

public interface RegularPolygon {
	public int getNumSides();
	public double getSideLength();
	
	static int totalSides(RegularPolygon[] polygons) {
        int total = 0;
        for (RegularPolygon p : polygons) {
            if (p != null) {
                total += p.getNumSides();
            }
        }
        return total;
    }
	
	//default methods
	default double getPerimeter() {
        return getNumSides() * getSideLength();
    }
	
	default double getInteriorAngle() {
        int n = getNumSides();
        return (double)(n - 2) * Math.PI / n;
    }
}
