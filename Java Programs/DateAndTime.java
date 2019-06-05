public class DateAndTime
{
    // Variables for date function
    
    private int hour;
    private int minute;
    private int second;
    
    // Variables for time function
    
    private int month;
    private int day;
    private int year;
    
    // Array that stores days per each month 1-12
    
    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    // Default constructor
    
    public DateAndTime()
    {
        this(0, 0, 0);
    }
    
    // Time constructor with an int parameter that changes the hour
    
    public DateAndTime(int hour)
    {
        this (hour, 0, 0);
    }
    
    // Time constructor with 2 parameters that change the hour & minute
    
    public DateAndTime(int hour, int minute)
    {
        this(hour,minute,0);
    }
    
    // Constructor with 3 parameters that change hour, minute, and second
    
    public DateAndTime(int hour, int minute, int second)
    {
        if (hour < 0 || hour >= 24)
        {
            throw new IllegalArgumentException("hour must be 0-23");
        }
        
        else if (minute < 0 || minute >= 60)
        {
            throw new IllegalArgumentException("minute must be 0-59");
        }
        
        else if (second < 0 || second >= 60)
        {
            throw new IllegalArgumentException("second must be 0-59");
        }
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    // Constructor with an object parameter
    
    public DateAndTime (DateAndTime time)
    {
        this(time.hour, time.minute, time.second);
    }
    
    // Function that sets the time
    
    public void setTime(int hour, int minute, int second)
    {
        if (hour < 0 || hour >= 24)
        {
            throw new IllegalArgumentException("hour must be 0-23");
        }
        
        else if (minute < 0 || minute >= 60)
        {
            throw new IllegalArgumentException("minute must be 0-59");
        }
        
        else if (second < 0 || second >= 60)
        {
            throw new IllegalArgumentException("second must be 0-59");
        }
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        
    }
    
    // Function that declares the hour
    
    public void setHour(int hour)
    {
        if (hour < 0 || hour >= 24)
        {
            throw new IllegalArgumentException("hour must be 0-23");
        }
        
        this.hour= hour;
    }
    
    // Function that defines the minute
    
    public void setMinute(int minute)
    {
        if (minute < 0 || minute >= 60)
        {
            throw new IllegalArgumentException("minute must be 0-59");
        }
        
        this.minute = minute;
    }
    
    // Function that sets the second
    
    public void setSecond(int second)
    {
        if (second < 0 || second >= 60)
        {
            throw new IllegalArgumentException("second must be 0-59");
        }
        
        this.second = second;
    }
    
    // Accessors
    
    // returns the hour
    
    public int getHour()
    {
        return hour;
    }
    
    // returns the minute
    
    public int getMinute()
    {
        return minute;
    }
    
    // returns the second
    
    public int getSecond()
    {
        return second;
    }
    
    // String format of the calendar
    
    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
    
    // increment the minute by 1
    
    public void incrementMin()
    {
        minute = minute + 1;
        
        if (minute > 59)
        {
            hour++;
            minute = 0;
        }
    }
    
    // increment the hour by 1
    
    public void incrementHour()
    {
        hour = hour + 1;
        
        if (hour > 23)
        {
            hour = 0;
        }
    }
    
    // increment the second by 1
    
    public void incrementSecond()
    {
        second = second + 1;
        
        if (second > 59)
        {
            second = 0;
            minute++;
        }
    }
    
    // format the hour by the string
    
    public String toString()
    {
        return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12), getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
    
    // Constructor that holds the time and date
    
    public DateAndTime(int month, int day, int year, int hour, int minute, int second)
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
        
        this.hour = hour;
        
        this.minute = minute;
        
        this.second = second;
        
        System.out.printf("Date object constructor for date %s%n", this);
        
    }
    // returns a string of the form MM/DD/YY
    
    public String toStringforDate()
    {
        return String.format("%d/%d/%d  %02d:%02d:%02d", month, day, year, getHour(), getMinute(), getSecond());
    }
}
