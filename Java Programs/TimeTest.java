// Main program for class Date2

public class TimeTest
{
    public static void main(String[] args)
    {
        Date2 D1 = new Date2(12, 25, 2000);
        
        System.out.println("Constructed with: ");
        displayDate("Output for D1: ", D1);
        
        try
        {
            Date2 D2 = new Date2(27, 74, 99);
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("%nException while initializing D2: %s%n", e.getMessage());
        }
    }
    
    // displays the object
    
    private static void displayDate(String header, Date2 D)
    {
        System.out.printf("%s%n %s%n", header, D.toString());
    }

}
