package week13;

public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}	

	@Override
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	@Override
	public String toString() {
		return "The area of the triangle is: " + getArea() +
				"\nThe perimeter is: " + getPerimeter() +
				"\nThe color is: " + getColor() +
				"\nIs filled? " + isFilled();
	}

	@Override
	public int compareTo(Object arg0) {
		return 0;
	}

}
