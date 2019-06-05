public class SalariedEmployee extends Employee
{
    private double weeklySalary;
    
    // Constructor
    
    public SalariedEmployee(String firstName, String LastName, String socialSecurityNumber, double weeklySalary, Date date)
    {
        super(firstName, LastName, socialSecurityNumber, date);
        
        if (weeklySalary < 0.0)
        {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }
        
        this.weeklySalary = weeklySalary;
    }
    
    public void setWeeklySalary(double weeklySalary)
    {
        if (weeklySalary < 0.0)
        {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }
        
        this.weeklySalary = weeklySalary;
    }
    
    public double getWeeklySalary()
    {
        return weeklySalary;
    }
    
    @Override
    public double earnings()
    {
        return getWeeklySalary();
    }
    
    public String toString()
    {
        return String.format("salaried employee: %s%n%s: $%, .2f");
    }
}
