import java.util.Random;
import java.util.Scanner;

public class Dice
{
    public static int rolldice()
    {
        Random rand = new Random();
        
        int die = rand.nextInt(6); // obtain a random number 0 - 5
        die += 1; // adds 1 to get a random number from 1-6
        
        int cube = rand.nextInt(6);
        cube += 1;
        
        int sum = cube + die;   // adds the two dice together
        
        return sum;
    }
    
    // main function
    
    public static void main (String args[])
    {
        int num = 0;        // for user entry
        int i = 0;          // for loop to stop at the number the user entered
        int counter = 0;    // to store the returned int of the RollDice function
        int count = 0;      // counts the number of times a dice rolls a 2
        int number = 0;     // counts the number of times a dice rolls a 7
        Scanner scan = new Scanner(System.in);  // for user input
        
        // for user entry
        
        System.out.print("How many times would you like to roll the two dice? ");
        
        num = scan.nextInt();
        
        // counts how many times a pair of dice equal to 2 or 7
        
        while (i != num)
        {
            counter = rolldice();
            
            if (counter == 2)
            {
                count++;
            }
            
            else if (counter == 7)
            {
                number++;
            }
            
            i++;
        }
        
        // Displays summary
        
        System.out.println();
        System.out.println("Snake eyes (double 1s) appeared");
        System.out.printf("\t%d%s", count, " times\n");
        System.out.printf("\t%.2f%s", (double)count/num*100, " % of the time");
        System.out.println();
        
        System.out.println();
        System.out.println("A roll of 7 appeared");
        System.out.printf("\t%d%s", number, " times\n");
        System.out.printf("\t%.2f%s", (double)number/num*100, "% of the time\n");
        System.out.println();
    }
}
