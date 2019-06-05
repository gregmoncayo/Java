/* Name: Gregory Moncayo (GLM16B)
 Date: 01/21/2019
 Assignment: Assignment# 1
 Due Date: 01/24/2019
 About this project: To learn basic java input/output, arthimetic
 Assumptions: May assumer the user will not enter a negative value
 
 All work below was performed by Gregory Moncayo */

import java.util.Scanner;       // Class for user input

// Main Class
public class sales
{
    
    // Main function
    public static void main(String[] args)
    {
        double tv = 0.0;                // variable for tv price
        double washer = 0.0;            // variable for washer/dryer price
        double refrigerator = 0.0;      // variable for refrigerator price
        double microwave = 0.0;         // variable for microwave price
        double tax = 0.0;               // variable for tax percentage
        
        // Main Menu for user input
        
        System.out.println("Welcome to sales!!\n");
        Scanner scan = new Scanner(System.in);
        
        System.out.print("What was the price of the TV? ");
        tv = scan.nextDouble();
        
        System.out.print("and what was the price of the washer/dryer? ");
        washer = scan.nextDouble();
        
        System.out.print("and what was the price of the refrigerator? ");
        refrigerator = scan.nextDouble();
        
        System.out.print("and what was the price of the microwave? ");
        microwave = scan.nextDouble();
        
        System.out.print("What is the local sales tax rate?: ");
        tax = scan.nextDouble();
        
        // Displays the results
        
        System.out.println("\nPrices: ");
        System.out.printf("\tTV \t\t= %.2f\n", tv);
        System.out.printf("\tWasher/Dryer    = %.2f\n", washer);
        System.out.printf("\tRefrigerator    = %.2f\n", refrigerator);
        System.out.printf("\tMicrowave \t= %.2f\n", microwave);
        
        double sum = tv + washer + refrigerator + microwave;
        double percent = tax/100;
        double total = sum*percent;
        
        System.out.println();
        System.out.printf("Your subtotal is $ %.2f\n", sum);
        System.out.printf("And at a tax rate of %.1f", tax);
        System.out.printf(" percent, this will add $ %.2f", total, " in sales tax");
        System.out.printf("\nfor a grand total of $ %.2f", total+sum);
        System.out.println("\n");
        System.out.println("Goodbye!!");
        
    }
}
