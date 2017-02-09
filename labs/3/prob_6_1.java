

/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (6.1)
 */
public class prob_6_1 {
    
    
    public static void main(String[] args) {
        for (int a =1; a<100;a++)
        {
            if (a==10)
            {
               getPentagonalNumber(a); 
            }
            if (a%10==0)
            {
                System.out.println();
            }
               getPentagonalNumber(a); // JA: You should print the value from here, not have the method
			   // JA: return the value and print. Methods should do one thing.
            
        }
    }
    public static int getPentagonalNumber (int n)
    {
         n = (n*(3*n)-1)/2; // JA: The equation should be n*(3*n -1)/2
        if (n>5) // JA: Not sure what this is for
        {
            n=n-1;
        }
        System.out.print(" "+n+" ");
        return n;
    }
    
}
