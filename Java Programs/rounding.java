/* Name: Gregory Moncayo
 Date: 09/17/2018
 Assignment: Assignment #2
 Due Date: 09/17/2018
 About this project: To learn more about Math Floor
 
 All work below was performed by Gregory Moncayo */

import java.util.Scanner;

public class rounding
{
    // main function
    
   public static void main (String[] args)
    {
        // for user input
        
        Scanner in = new Scanner (System.in);
        
        // For user entry and display results
        
        System.out.println("Please enter a number: ");
        
        double x = in.nextDouble();
        
        // Displays user input number
        
        System.out.printf("Original number: %.2f", x);
        System.out.println("\n");
        
        double y = Math.floor(x+0.5);
        
        // Display rounded number
        
        System.out.printf("New number: %.2f", y);
        System.out.println("\n");
        
    }
}
