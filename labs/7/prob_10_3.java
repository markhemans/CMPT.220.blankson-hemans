/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mark
 */
public class prob_10_3
{
     public static void main(String[] args) {

        MyInteger number1 = new MyInteger(2);
        MyInteger number2 = new MyInteger(2);
        MyInteger number3 = new MyInteger(9);
        MyInteger number4 = new MyInteger(11);
        
        
        System.out.println("Even number Test: ");
        System.out.println("Value: " +number1.getValue());
        System.out.println("Is prime?: " +number1.isPrime());
        System.out.println("Is Odd?: " +number1.isOdd());
        System.out.println("Is Even?: " +number1.isEven());
        System.out.println("");
        System.out.println("Odd number Test");
        System.out.println("Value: " +number3.getValue());
        System.out.println("Is prime?: " +number3.isPrime());
        System.out.println("Is Odd?: " +number3.isOdd());
        System.out.println("Is Even?: " +number3.isEven());
        System.out.println("");
        System.out.println("Prime number Test");
        System.out.println("Value: " +number4.getValue());
        System.out.println("Is prime?: " +number4.isPrime());
        System.out.println("");
        System.out.println("variable 'number1' == variable 'number2': " +number1.equals(number2));
        System.out.println("variable 'number1' == variable 'number3' " +number1.equals(number3));
        System.out.println("12321 to string value: "  +MyInteger.parseInt("12321"));
        System.out.println("12321 to char[] array value: " +MyInteger.parseInt("12321".toCharArray()));

    }
}
    
    

