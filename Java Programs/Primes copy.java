import java.util.Scanner;

public class Primes
{
    // function that checks whether the number is prime or not
    
    public static boolean isPrime(int X)
    {
        // returns false if function is the number isn't prime
        
        for (int i = 2; i < X; i++)
        {
            if (X % i == 0)
                return false;
        }
        
        return true;
    }
    
    public static void main(String args[])
    {
        Scanner Scan = new Scanner(System.in);  // for user input
        int num = 0;    // variable to store user's choice
        
        // for user entry
        
        System.out.print("Please input a positive number: ");
        num = Scan.nextInt();
        
        // checks if number is prime if the number is positive
        
        if (num > 0)
        {
            // Display results
            
            System.out.printf("%d%sThe prime numbers less than or equal to ", num, " are: ");
            System.out.println();
            
            
            for (int i = 2; i < num; i++)
            {
                if (isPrime(i) == true)
                {
                    System.out.printf(" %d ", i, " ");
                }
                
            }
            
            System.out.println();
        }
    }
}
