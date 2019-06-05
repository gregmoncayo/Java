import java.security.SecureRandom;

public class TwoD
{
    public static void main(String[] args)
    {
        // Two-Dimmensional Array
        
        int [][] rc = new int [6][4];
        
        // For randomization of a number
        
        SecureRandom random = new SecureRandom();
        
        int number = random.nextInt(10);
        
        // Prints out the random number in a square
        
        for (int [] i : rc)
        {
            for (int j: i)
            {
                System.out.print(number);
            }
            
            System.out.print("\n");
        }
        
    }
}
