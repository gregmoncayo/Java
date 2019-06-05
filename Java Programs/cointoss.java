/* Name: Gregory Moncayo
 Date: 09/17/2018
 Assignment: Assignment #2
 Due Date: 09/17/2018
 About this project: To learn more about Math Floor
 
 All work below was performed by Gregory Moncayo */

import java.security.SecureRandom;      // library for randomalization
import java.util.Scanner;               // general library for input

public class cointoss
{
    private enum Coin {Heads, tails};       // Enum to contain heads or tails
    
    // Function to flip the coin with randomization
    
    public static Coin flip()
    {
        SecureRandom random = new SecureRandom();   // to call randomization
        
        int number = 1 + random.nextInt(2);     // randomlize the number
        
        // Returns heads if computer returns 1, returns tails otherwise.
        
        if (number == 1)
        {
            
            return Coin.Heads;
        }
        
        else
        {
            return Coin.tails;
        }
        
    }
    
    // Main function
    
    public static void main (String args[])
    {
        int choice = 0, count = 0, counter = 0;     // variables to count for heads, tails, and user input.
        Scanner in = new Scanner (System.in);       // for user input
        
        // Display menu
        
        System.out.println("Welcome to coin toss! Please select a choice. \n");
        System.out.println("1. Toss \n" );
        System.out.println("2. Quit \n" );
        System.out.println("> ");
        choice = in.nextInt();
        
        // Exits loop if user press quits, counts how many times the computer lands on heads or tails
        
        while (choice != 2)
        {
            Coin result = flip();
            
            if (result == Coin.Heads)
            {
                System.out.println("Computer chose Heads! \n");
                count++;
            }
            
            else if (result == Coin.tails)
            {
                System.out.println("Computer chose tails! \n");
                counter++;
            }
            
            System.out.println("> ");
            choice = in.nextInt();
            
        }
        
        // Displays the summary
        
        System.out.println("The summary: \n");
        System.out.println("Heads: \n");
        System.out.print(count);
        System.out.println("\n");
        System.out.println("Tails: \n");
        System.out.print(counter);
        System.out.println("\n");
    }
}


