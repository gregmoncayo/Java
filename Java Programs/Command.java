import java.util.Scanner;

public class Command
{
    public static void main(String[] args)
    {
        int size = 0;   // size of the array
        
        
        // If calling parameter length is not 0, get the integer size of the string
        
        if (args.length != 0)
        {
            size = Integer.parseInt(args[0]);
        }
        
        // If calling parameter is 0, size of the array is 10
        
        else
        {
            size = 10;
        }
        
        // Labeled new array with corresponding size
        
        int [] array = new int [size];
        
        // Prints the index and the value of the array
        
        System.out.printf("%s%8s%n", "Index", "Value");
        
        for (int counter = 0; counter < array.length; counter++)
        {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}
