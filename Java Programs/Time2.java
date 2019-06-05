import java.lang.String;

public class Time2
{
    private int hour;
    private int minute;
    private int second;
    
    // Default constructor
    
    public Time2()
    {
        this(0, 0, 0);
    }
    
    // Constructor with 1 parameter that sets the hour
    
    public Time2(int hour)
    {
        this (hour, 0, 0);
    }
    
    // Constructor that sets the hour & minute
    
    public Time2(int hour, int minute)
    {
        this(hour,minute,0);
    }
    
    // Constructor that sets the hour, minute, and second
    
    public Time2(int hour, int minute, int second)
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
    
    public Time2 (Time2 time)
    {
        this(time.hour, time.minute, time.second);
    }
    
    //  Sets the time
    
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
    
    // Sets the hour
    
    public void setHour(int hour)
    {
        if (hour < 0 || hour >= 24)
        {
            throw new IllegalArgumentException("hour must be 0-23");
        }
        
        this.hour= hour;
    }
    
    // Sets the minute
    
    public void setMinute(int minute)
    {
        if (minute < 0 || minute >= 60)
        {
            throw new IllegalArgumentException("minute must be 0-59");
        }
        
        this.minute = minute;
    }
    
    // Sets the second
    
    public void setSecond(int second)
    {
        if (second < 0 || second >= 60)
        {
            throw new IllegalArgumentException("second must be 0-59");
        }
        
        this.second = second;
    }
    
    // Accessors
    
    // Returns the hour
    
    public int getHour()
    {
        return hour;
    }
    
    // Returns the minute
    
    public int getMinute()
    {
        return minute;
    }
    
    // Returns the second
    
    public int getSecond()
    {
        return second;
    }
    
    // Returns the time as a string
    
    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
    
    // Increment the minute by 1
    
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
    
    // returns the format as a string
    
    public String toString()
    {
        return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12), getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }

}
