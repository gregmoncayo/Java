/* Name: Gregory Moncayo
 Date: 09/17/2018
 Assignment: Assignment #2
 Due Date: 09/17/2018
 About this project: (write a small blurb about what this project's goals are/what tasks it accomplishes)
 
 All work below was performed by Gregory Moncayo */

import java.util.Scanner;               // general library for user input
import java.security.SecureRandom;      // library for randomization

public class guess
{
        // Main function
    
		public static void main (String[] args)
		{
            Scanner in = new Scanner(System.in);        // for user input
            
			char choice = 'Y';
			int num = 0;	// User number
            
            
            SecureRandom random = new SecureRandom();   // for randomization
            
            int number = 1 + random.nextInt(1000);      // random number from computer
            
            // Display menu for user input
            
			System.out.print("Guess a number: ");
			num = in.nextInt();

            /*
                Loop that allows the user to guess as many times until they get the correct number.
                If user guesses correctly, prints a congrats message and ask the user if they want
                to play again. Exits the program if the user selects No.
             */
            
		while (choice != 'n' && choice != 'N')
        {
			if (num < number)
			{
				System.out.println("Too low. Try again: ");
				num = in.nextInt();
			}

			else if (num > number)
			{
				System.out.println("Too high. Try again: ");
				num = in.nextInt();
			}

			else if (num < 0 || num > 1000)
			{
				System.out.println("Not a valid input. Please try again: ");
				num = in.nextInt();
			}

			else if (num == number)
			{
				System.out.println("Congratulations. You guessed the number! \n");
				System.out.println( "Would you like to try again? (Y/N): ");
                choice = in.next().charAt(0);
			}

		}

		}
}
