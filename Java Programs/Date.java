import java.util.Scanner;   // library for input
import java.lang.String;    // library for String

public class Date
{
	private static int day;             // variable to store the day of the calendar
	private static int month;           // variable to store the month of the calendar
	private static int year;            // variable to store the year of the calendar
	private static char format;         // variable to store the format of the calendar
	private static String m;            // String to type out the month of the year

    // Function that confirms the display of the date
    
	void Format(char F)
	{
		format = 'D';
		
		if (F == 'L' || F == 'l')
		{
			format = F;
		}

		else if (F == 'S' || F == 's')
		{
			format = F;
		}	
	}

    // Displays the date
    
	public static void show()
	{
		if (format == 'D' || format == 'd')
		{
            System.out.print(month);
            System.out.print(" ");
			System.out.print(day);
            System.out.print(" ");
			System.out.print(year);
		}

		else if (format == 'L' || format == 'l')
		{
            System.out.print(m);
            System.out.print(" ");
			System.out.print(day);
            System.out.print(" ");
			System.out.print(year);
		}

		else if (format == 'S' || format == 's')
		{
			System.out.print(day);
            System.out.print(" ");
			System.out.print(year);
		}
	}
    
    // Default Constructor

	Date()
	{
		month = 1;
		day = 1;
		year = 2000;		
	}
    
    // Function that takes in 3 integers to represent MM/DD/YY

	static void Date1(int d, int m, int y)
	{
		format = 'D';
		
		day = d;
		month = m;
		year = y;		
	}
    
    // Function that takes in 2 integers and 1 string to represent MM/DD/YY but spells out the month

	static void Date2(int dy, String mon, int ye)
	{
		format = 'L';

		day = dy;
		m = mon;
		year = ye;
	}
    
    // Function that takes in 2 integers to represent DD/YY

	public static void Date3(int DDD, int YYYY)
	{
		format = 'S';
		
		day = DDD;
		year = YYYY;
	}

		public static void main(String [] args)
		{
			Scanner Scan = new Scanner(System.in);              // For user input
            
            // For user input, displays error message if user types in valid data
            
			System.out.println("Please input a month: ");
			month = Scan.nextInt();

			while (month < 1 || month > 12)
			{
                System.out.println("Please input a valid month: ");
				month = Scan.nextInt();
			}

			System.out.println("\n Please input a day of the month: ");
			day = Scan.nextInt();

			while (day < 1 || day > 31)
			{
                System.out.println("Please input a valid day: ");
				day = Scan.nextInt();
			}

			System.out.println("\n Please input a valid year: ");
			year = Scan.nextInt();

			while (year < 0)
			{
				System.out.println("Please input a valid year: ");
				year = Scan.nextInt();
			}
            
            Date1(day, month, year);
            show();
            System.out.print("\n");
            
            Date3(day, year);
            show();
            System.out.print("\n");
            
            // Switch statement to print the string
            
            switch (month)
            {
        case 1:
                    Date2(day, "January", year);
                    show();
                    System.out.print("\n");
            break;
        case 2:
                    Date2(day, "February", year);
                    show();
                    System.out.print("\n");
            break;
        case 3:
                    Date2(day, "March", year);
                    show();
                    System.out.print("\n");
            break;
        case 4:
                    Date2(day, "April", year);
                    show();
                    System.out.print("\n");
            break;
        case 5:
                    Date2(day, "May", year);
                    show();
                    System.out.print("\n");
            break;
        case 6:
                    Date2(day, "June", year);
                    show();
                    System.out.print("\n");
            break;
        case 7:
                    Date2(day, "July", year);
                    show();
                    System.out.print("\n");
            break;
        case 8:
                    Date2(day, "August", year);
                    show();
                    System.out.print("\n");
            break;
        case 9:
                    Date2(day, "September", year);
                    show();
                    System.out.print("\n");
            break;
        case 10:
                    Date2(day, "October", year);
                    show();
                    System.out.print("\n");
            break;
        case 11:
                    Date2(day, "November", year);
                    show();
                    System.out.print("\n");
            break;
        case 12:
                    Date2(day, "December", year);
                    show();
                    System.out.print("\n");
            break;
            }

		}
}
