public class CommissionEmployee extends Employee
{
    private double grossSales;      // grossly weekly sales
    private double commissionRate;      // commission percentage
    
    // five-argument constructor
    public CommissionEmployee(String FirstName, String LastName, String SocialSecurityNumber, double grossSales, double commissionRate)
    {
        super(FirstName, LastName, SocialSecurityNumber);
        
        // if gross sales is invalid throw exception
        if (grossSales < 0.0)
        {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        
        // if commissionRate is invalid throw exception
        
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
        {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    
    
    public double getGrossSales()
    {
        return grossSales;
    }
    
    public void setGrossSales(double grossSales)
    {
        if (grossSales < 0.0)
        {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        
        this.grossSales = grossSales;
    }
    
    public void setCommissionRate(double commissionRate)
    {
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
        {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and 1.0");
        }
        
        this.commissionRate = commissionRate;
    }
    
    public double getCommissionRate()
    {
        return commissionRate;
    }
    
    public double earnings()
    {
        return getCommissionRate() * getGrossSales();
    }
    
    @Override
    public String toString()
    {
        return super.toString()+String.format("%s: %s %.2f %s %.2f", "commission employee", "gross sales", getGrossSales(), "commission rate", getCommissionRate());
    }
}
