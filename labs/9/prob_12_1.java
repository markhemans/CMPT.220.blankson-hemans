/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (12.1)
 */
public class prob_12_1 {
  
  
  public static void main(String[] args) {

    
 
    if (args.length != 3) {
      System.out.println("Usage: java Calculator operand1 operator operand2");
      System.exit(0);
    }

 
    int result = 0;

   try{
    switch (args[1].charAt(0))
    {
      case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
      case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
      case '*': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
      case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
    }

   
    System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
   }
   catch (NumberFormatException ex)
   {
   System.out.println("Please Enter An Integer");    
   }
  }
}
    

