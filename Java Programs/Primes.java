import java.util.Scanner;   // library for input
import java.util.*;         // Library for string

// Class Prime

public class Primes
{
    
    // Checks if the number is prime or not
    
    static boolean isPrime(int n)
    {
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        
        return true;
    }
    
    // Main function
    
    public static void main(String[] args)
    {
        int INT_MAX = 0;        // variable for user input
        String answer = "";     // String to concatenate the answer
        Scanner sc = new Scanner(System.in);        // for user input
        
        // Asks user to enter an number
        
        System.out.print("Enter the upper limit: ");
        INT_MAX = sc.nextInt();
        
        // goes through each number to determine whether they're prime or not
        
        for (int i = 2; i < INT_MAX; i++)
        {
            if (isPrime(i))
                answer+= i + ", ";
        }
        
        // Deletes last comma
        
        if(answer.endsWith(", "))
        {
            answer = answer.substring(0,answer.length() - 2);
        }
        
        // Displays results
        
        System.out.println("The prime numbers are: ");
        System.out.printf("%s", answer);
        System.out.println();
        
    }
}
