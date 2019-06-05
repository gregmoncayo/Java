import java.lang.String;

public class Date2
{
    private int month;
    private int day;
    private int year;
    
    // Array that stores the day of the month within each month 1-12
    
    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    // Constructor with three parameters that represent MM/DD/YY
    
    public Date2(int month, int day, int year)
    {
        if (month <= 0 || month > 12)
        {
            throw new IllegalArgumentException("month (" + month + " ) must be 1-12");
        }

        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
        {
            throw new IllegalArgumentException("day (" + day + " ) out of range for specific month and year");
        }

    if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
    {
        throw new IllegalArgumentException("day (" + day + " ) out of range for specific month and year");
    }

    this.month = month;

    this.day = day;

    this.year = year;

    System.out.printf("Date object constructor for date %s%n", this);

    }
    // returns a string of the form MM/DD/YY

    public String toString()
    {
        return String.format("%d/%d/%d", month, day, year);
    }

}
