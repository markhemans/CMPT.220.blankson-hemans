
import java.util.Scanner;


/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (6.3)
 */
public class prob_6_3 {
    
    
    public static void main(String[] args) {
        
        
       Scanner input = new Scanner(System.in);
       System.out.print("Enter an integer: ");
       int number = input.nextInt();
       
       if(isPalindrome(number))
        {
            System.out.println("Number : " + number + " is a palindrome");
        }
        else
        {
            System.out.println("Number : " + number + " is not a palindrome");
        
        }
    }
    

    public static boolean isPalindrome (int number)
    {
        int palindrome = number;
        int reverse = 0;
       while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;


    }
    public static int reverse (int number)
    {
       
        return number;
    }
}
