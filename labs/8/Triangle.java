/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (11.1)
 */

public class Triangle extends GeometricObject {

    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;


    public Triangle()
    {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }
    
    public Triangle(double side1, double side2, double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1()
    {
        return side1;
    }
    public double getSide2()
    {
        return side2;
    }
    public double getSide3()
    {
        return side3;
    }

    
    public double getArea()
    {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.pow(s*(s-side1)*(s-side2)*(s - side3),0.5);
    }

    public double getPerimeter()
    {
        return side1 + side2 + side3;
    }

    @Override
    public String toString()
    {
        return "Triangle{" + "side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + '}';
    }

  
}
