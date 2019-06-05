public abstract class Employee
{
	private final String firstName;
    private final String lastName;
    private final String socialSecurityNumer;
    private final Date date;
    
    // constructor
    
    public Employee(String firstName, String lastName, String socialSecurityNumer, Date date)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumer = socialSecurityNumer;
        this.date = date;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumer;
    }
    
    public Date getDate()
    {
        return date;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s %s%nsocial security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
    }
    
    // abstract method must be overriden by concrete subclasses
    public abstract double earnings(); // no implementation here
    
}
