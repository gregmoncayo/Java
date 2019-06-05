// Main program for DateAndTime class

public class DateAndTimeTest
{
    public static void main(String[] args)
    {
            DateAndTime DT1 = new DateAndTime(12, 25, 2000, 4, 13, 31);
        
            
            System.out.println("Date and Time: ");
            displayDateAndTime("The date and time is: ", DT1);
        
    }
        // Displays the object
    
        private static void displayDateAndTime(String header, DateAndTime DT)
        {
            System.out.printf("%s%n %s%n", header, DT.toStringforDate());
        }
}
