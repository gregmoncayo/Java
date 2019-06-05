/* Name: Gregory Moncayo (GLM16B)
 Date: 01/25/2019
 Assignment: Assignment # 2
 Due Date: 02/1/2019
 About this project: To learn basic java input/output, arthimetic
 Assumptions: May assumer the user will not enter a negative value
 
 All work below was performed by Gregory Moncayo */

import java.util.Scanner;       // Class for user input
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
import java.lang.Math;

public class shipping
{
	public static void main (String [] args)
	{
        Scanner Scan = new Scanner(System.in);
        double weight = 0.0;
        int miles = 0;
        double discount = 0.1;
        double rate = 0.0;
        
        // Displays user display menu for user input
        
        System.out.println("Welcome to Amazon Shipping Calculator\n");
        
        System.out.print("Please enter the weight of the package, in Kg:");
        weight = Scan.nextDouble();
        
        // error message if weight is entered incorrectly
        
        if (weight < 0)
        {
            System.out.println("Invalid package weight. Program aborted");
            System.exit(0);
        }
        
        else if (weight > 20)
        {
            System.out.println("Cannot accept packages over 20 Kg. Program aborted");
            System.exit(0);
        }
        
        // sets rate according to weight
        
        else if (weight <= 2)
        {
            rate = 5.10;
        }
        
        else if (weight > 2 && weight < 7)
        {
            rate = 10.18;
        }
        
        else if (weight > 6 && weight < 11)
        {
            rate = 22.43;
        }
        
        else if (weight > 10 && weight < 20)
        {
            rate = 40.60;
        }
        
        // Ask user to enter in miles
        
            System.out.print("Please enter the distance to be shipped (in miles): ");
            miles = Scan.nextInt();
        
        
        // Error message if user inputs wrong distance
        
            if (miles < 0)
            {
                System.out.println("Shipping distance must be positive. Program aborted");
                System.exit(0);
            }
            
            else if (miles > 3000)
            {
                System.out.println("Cannot ship more than 3000 miles. Program aborted.");
                System.exit(0);
            }
        
            System.out.println();
        
        // Ask user if their a prime member or not
        
            System.out.print("Are you an Amazon Prime member? (Yes/No): ");
            String choice = Scan.next();
            String Str = choice.toUpperCase();
        
        // Display summary if you have amazon prime
        
            if (Str.equals("YES"))
            {
                double sum = 0.0;
                double ship = miles / 50;
                
                if (ship % 1 == 0)
                {
                    ship = Math.round(ship+1);
                    sum = ship * rate;
                }
                
                else
                {
                    sum = (miles / 50) * rate;
                }
                
                double tot = sum * discount;
                System.out.println();
                System.out.printf("Package weight = %.2f%s", weight, " kg");
                System.out.println();
                System.out.printf("Shipping rate = %.2f%s",rate, " per 50 miles");
                System.out.println();
                System.out.printf("Number of miles = %d", miles);
                System.out.println();
                System.out.printf("Total shipping charges = %.2f", sum-tot);
                System.out.println();
                
                System.out.println();
                System.out.println("Goodbye");
            }
        
        // Displays summary without amazon prime
        
            else if (Str.equals("NO"))
            {
                double total = 0.0;
                double shipMi = miles / 50;
                
                if (shipMi % 1 == 0)
                {
                    shipMi = Math.round(shipMi+1);
                    total = (shipMi) * rate;
                    System.out.printf("Answer: %.2f", shipMi);
                }
                
                else
                {
                    total = (miles / 50) * rate;
                }
                
                System.out.println();
                System.out.printf("Package weight = %.2f%s", weight, " kg");
                System.out.println();
                System.out.printf("Shipping rate = %.2f%s", rate, " per 50 miles");
                System.out.println();
                System.out.printf("Number of miles = %d", miles);
                System.out.println();
                System.out.printf("Total shipping charges = $ %.2f", total);
                System.out.println();
        
                System.out.println();
                System.out.println("Goodbye");
            }
	}
}
