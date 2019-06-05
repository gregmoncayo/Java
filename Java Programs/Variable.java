import java.util.Scanner;

public class Variable
{
    public static void main(String[] args)
    {
        int num = 0;        // Stores the size of the array
        int number = 0;     // Stores the number that the user enters
        
        // Scanner for user input
        
        Scanner in = new Scanner(System.in);
        
        // Display menu for user entry
        
        System.out.print("Please enter the size of the array: ");
        num = in.nextInt();
        
        int [] arr = new int [num];     // An array of integers
        
        System.out.printf("\nPlease enter %d\n", num  ," digits ");
        
        for (int i = 0; i  < num; i++)
        {
            System.out.print("> ");
            number = in.nextInt();
            arr[i] = number;
        }
        
        // Summary
        
        System.out.print("The product of the array is: \n");
        System.out.print(Product(num, arr));
        System.out.print("\n");
    }
    
    // Multiples within the array and returns the answer
    
    public static int Product(int size, int array[])
    {
        int total = 1;
        
        for (int i = 0; i < size; i++)
        {
            total *= array[i];
        }
        
        return total;
    }
};
