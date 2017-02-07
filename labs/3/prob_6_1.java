

/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (6.1)
 */
public class prob_6_1 {
    
    
    public static void main(String[] args) {
        for (int a =1; a<101; a++)
        {
            
            if (a%10==0)
            {
                System.out.println();
            }
               getPentagonalNumber(a);
            
        }
    }
    public static int getPentagonalNumber (int n)
    {
         n = (n*(3*n)-1)/2;
        if (n>5)
        {
            n=n-1;
        }
        System.out.print(" "+n+" ");
        return n;
    }
    
}
