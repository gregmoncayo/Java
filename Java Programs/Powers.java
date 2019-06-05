import java.util.Scanner;      // For input

// Powers class

public class Powers
{
    // Main Menu
    
	public static void main (String [] args)
	{
		int LONG_MAX = 0;            // Variable for user inpit
		int mult = 1;           // variable for power base
		long sum = 1;           // variable for sum
		String answer = "1 + ";     // String to concatenate the results
        
        // For user input
		Scanner Scan = new Scanner(System.in);
		System.out.print("Enter the upper limit: ");
		LONG_MAX = Scan.nextInt();

        // Loop to multiple by 2
		while (sum < LONG_MAX)
		{
			mult = mult * 2;
            answer += mult + " + ";
			sum = sum + mult;
		}
        
        // Deletes last + from string
        
        if(answer.endsWith(" + "))
        {
            answer = answer.substring(0,answer.length() - 3);
        }

        // Displays results
        
		System.out.printf("%s%s", answer, " = ");
        System.out.printf("%d", sum);
        System.out.println();

	}
}
