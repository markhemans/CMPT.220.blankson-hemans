package week13;

public class Rectangle extends GeometricObject {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
	   this.width = width;
	   this.height = height;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public int compareTo(Object o) {
		if (getArea() < ((Rectangle)o).getArea()) 
			return -1;
		else if (getArea() == ((Rectangle)o).getArea())
			return 0;
		else
			return 1;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return 2 * ( width + height);
	}

	@Override
	public String toString() {
		return "Rectangle with width "+ width + " and height " + height;
	}
}
