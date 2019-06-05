public class CommissionEmployeeTest
{
    public static void main(String[] args)
    {
        CommissionEmployee employee = new CommissionEmployee("Sue", "Jones", "222-22-2222", 1000, .06);
        
        // get commission employee data
        System.out.println("Employee information obtained by get methods: ");
        System.out.printf("%n%s %s%n", "First name is", employee.getFirst());
        System.out.printf("%n%s %s%n", "Last name is", employee.getLast());
        System.out.printf("%n%s %s%n", "Social security number is", employee.getSocial());
        System.out.printf("%n%s %s%n", "Gross sales is", employee.getGrossSales());
        System.out.printf("%n%s %s%n", "Commission rate is", employee.getCommissionRate());
        
        employee.setGrossSales(5000);
        employee.setCommissionRate(.06);
        
        System.out.printf("%s: %s", "Updated employee information obtained by toString", employee);
    }
}
