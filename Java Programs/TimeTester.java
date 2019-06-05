import java.lang.String;

// Main program for Time class

public class Test
{

    public static void main(String[] args)
    {
        Time t1 = new Time();
        Time t2 = new Time(2);
        Time t3 = new Time(21, 34);
        Time t4 = new Time(12, 25, 42);
        Time t5 = new Time(t4);
        
	// Displays the object

        System.out.println("Constructed with: ");
        displayTime("t1: all default arguments", t1);
        displayTime("t2: hours specified, default minute and second", t2);
        displayTime("t3: hour and minute specifiedL defaut second ", t3);
        displayTime("t4: hour, minute and second specified ", t4);
        displayTime("t5: Time2 object t4 specified ", t5);
        
        try
        {
            Time t6 = new Time(27, 74, 99);
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("%nException while initializing t6: %s%n", e.getMessage());
        }
    }

	// Display the time objects
    
    private static void displayTime(String header, Time t)
    {
        System.out.printf("%s%n %s%n %s%n ", header, t.toUniversalString(), t.toString());
    }
}