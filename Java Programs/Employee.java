public class Employee
{
    private final String First;
    private final String Last;
    private final String Social;
    
	public Employee(String first, String last, String social)
	{
        this.First = first;
        this.Last = last;
        this.Social = social;
    }
    
    public String getFirst()
    {
        return First;
    }
    
    public String getLast()
    {
        return Last;
    }
    
    public String getSocial()
    {
        return Social;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s: %s %s %s %s %s %n", "Employee first name: ", getFirst(), "Employee last name: ", getLast(), "social security", getSocial());
    }
}
