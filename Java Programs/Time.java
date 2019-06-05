import java.lang.String;

// Time class without the increments

public class Time
{
    private int hour;
    private int minute;
    private int second;
    
    // Default constructor
    
    public Time()
    {
        this(0, 0, 0);
    }
    
    // Constructor with 1 parameters
    
    public Time(int hour)
    {
        this (hour, 0, 0);
    }
    
    // Constructor with 2 parameters
    
    public Time(int hour, int minute)
    {
        this(hour,minute,0);
    }
    
    // Constructor with 3 parameters
    
    public Time(int hour, int minute, int second)
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
    
    public Time (Time time)
    {
        this(time.hour, time.minute, time.second);
    }
    
    // Set function for the time
    
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
    
    // Set the hour
    
    public void setHour(int hour)
    {
        if (hour < 0 || hour >= 24)
        {
            throw new IllegalArgumentException("hour must be 0-23");
        }
        
        this.hour= hour;
    }
    
    // Set the minute
    
    public void setMinute(int minute)
    {
        if (minute < 0 || minute >= 60)
        {
            throw new IllegalArgumentException("minute must be 0-59");
        }
        
        this.minute = minute;
    }
    
    // Set the seconds
    
    public void setSecond(int second)
    {
        if (second < 0 || second >= 60)
        {
            throw new IllegalArgumentException("second must be 0-59");
        }
        
        this.second = second;
    }
    
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
    
    // Set the string format
    
    public String toString()
    {
        return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12), getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }

}
