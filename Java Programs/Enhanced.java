import java.util.Scanner;

public class Enhanced
{
    public static void main(String[] args)
    {
        int size = 0;       // size of the array
        double sum = 0.0;   // variable that stores the total of the array
        double len = 0.0;   // for parseDouble for the size of the array
        
        // if calling parameter is not 0, set array size
        
        if (args.length != 0)
        {
            len = Double.parseDouble(args[0]);
        }
        
        // If calling parameter is 0, array size is set
        
        else
        {
            size = 10;
        }
        
        // Declaration of the array
        
        double [] array = {50.5, 200.5, 150.0};
        
        // Adds up within the array
        
        for (double number : array)
        {
            sum += number;
        }
        
        // Displays summary
        
        System.out.printf("Total of array elements: %.2f", sum);
        System.out.print("\n");
    }
}
