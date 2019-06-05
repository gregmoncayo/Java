public class HourlyEmployeeTest
{
    public static void main(String[] args)
    {
        HourlyEmployee employee = new HourlyEmployee("Sue", "Jones", "222-22-2222", 80, 10.50);
        
        // get commission employee data
        System.out.println("Employee information obtained by get methods: ");
        System.out.printf("%n%s %s%n", "First name is", employee.getFirst());
        System.out.printf("%n%s %s%n", "Last name is", employee.getLast());
        System.out.printf("%n%s %s%n", "Social security number is", employee.getSocial());
        System.out.printf("%n%s %s%n", "hours of work is ", employee.returnHour());
        System.out.printf("%n%s %s%n", "Wage is", employee.ReturnWage());
        
        employee.setHour(50);
        employee.setWage(12);
        
        System.out.printf("%s: %s", "Updated employee information obtained by toString", employee);
    }
}
