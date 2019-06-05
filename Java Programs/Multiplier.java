import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiplier
{
    public static int quotient(int numerator, int denominator)
    {
        return numerator / denominator;
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        int numerator = 0;
        int denominator = 0;
        
        do
        {
            try
            {
                System.out.print("Please enter an integer numerator: ");
                numerator = scanner.nextInt();
                System.out.print("Please enter an integer denominator: ");
                denominator = scanner.nextInt();
                
                if (denominator == 0)
                {
                  throw new ArithmeticException("Oops, can't do that");
                }
                
                int result = quotient(numerator, denominator);
                System.out.printf("%n Result: %d / %d = %d%n", numerator, denominator, result);
                continueLoop = false;
            }
                catch (InputMismatchException inputMismatchException)
                {
                    System.err.printf("%n Exception: %s%n", inputMismatchException);
                    scanner.nextLine();
                    System.out.printf("You must enter an integer. Please try again %n%n");
                }
                
                catch (ArithmeticException arithematicException)
                {
                    System.err.printf("%nException: %s%n", arithematicException);
                    System.out.printf("Zero is an invalid denominator. Please try again %n%n");
                }
            
            finally
            {
                System.err.printf("Result: %d", numerator, " / %d", denominator);
                System.err.printf("Numerator is %d" , numerator);
                System.err.printf("Denominator is %d", denominator);
            }
        }
        while(continueLoop);
    }
}
