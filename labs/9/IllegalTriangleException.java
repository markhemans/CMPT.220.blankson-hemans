/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (12.5)
 */
public class IllegalTriangleException extends Triangle {
public static void main(String[] args) {

        Triangle t1;
        try {
            t1 = new Triangle(10, 10, 10);
        }
        catch (IllegalTriangleException e)
                {
                System.out.println("Triangle cannot exist.");
        }

    }
    
}
 
