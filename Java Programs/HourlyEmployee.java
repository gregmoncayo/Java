public class HourlyEmployee extends Employee
{
    private double Hour;
    private double Wage;
    
    HourlyEmployee(String first, String last, String Social, double hour, double wage)
    {
        super(first, last, Social);
        
        if (hour < 0 || hour > 168)
        {
            throw new IllegalArgumentException("Hours are not valid. Please try again. ");
        }
        
        if (wage < 0)
        {
            throw new IllegalArgumentException("Wage is not valid. Please try again.");
        }
        
        this.Hour = hour;
        this.Wage = wage;
    }
    
    public double returnHour()
    {
        return Hour;
    }
    
    public double ReturnWage()
    {
        return Wage;
    }
    
    public void setHour(double h)
    {
        if (h < 0 || h > 168)
        {
            throw new IllegalArgumentException("Hours are not valid. Please try again. ");
        }
        
        this.Hour = h;
    }
    
    public void setWage(double w)
    {
        if (w < 0)
        {
            throw new IllegalArgumentException("Wage is not valid. Please try again.");
        }
        
        this.Wage = w;
    }
}
