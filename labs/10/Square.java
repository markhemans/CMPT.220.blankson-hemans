package week13;

public class Square extends GeometricObject implements Colorable {
	private double side;
	
	public Square(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public int compareTo(Object o) {
		if (side < ((Square)o).side)
			return -1;
		else if (side == ((Square)o).side)
			return 0;
		else 
			return 1;
	}

	@Override
	public String howToColor() {
		return "Color all sides";
	}

	@Override
	public double getArea() {
		return side * side;
	}

	@Override
	public double getPerimeter() {
		return 4 * side;
	}

}
