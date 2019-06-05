import java.util.Calendar;

public class PayrollSystemTest
{
    public static void main(String[] args)
    {
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00, new Date(12, 7, 1965));
        
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40, new Date(2, 20, 2000));
        
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06, new Date(6, 3, 1995));
        
        BasedPlusCommissionEmployee basedPlusCommissionEmployee = new BasedPlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300, new Date(9, 27, 1983));

    /*
    System.out.println("Employees proceed individually: ");
    
    System.out.prinf("%n%s%n%s: $%, .2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
    
    System.out.prinf("%n%s%n%s: $%, .2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());

    System.out.prinf("%n%s%n%s: $%, .2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
    
    System.out.prinf("%n%s%n%s: $%, .2f%n%n", basedPlusCommissionEmployee, "earned", basedPlusCommissionEmployee.earnings());
     */
   
    Employee[] employees = new Employee[4];
    
    employees[0] = salariedEmployee;
    employees[1] = hourlyEmployee;
    employees[2] = commissionEmployee;
    employees[3] = basedPlusCommissionEmployee;
    
    System.out.printf("Employees processed polymorphically: %n%n");
    
    for (Employee currentEmployee: employees)
    {
        System.out.print(currentEmployee);
        
        if (currentEmployee.getDate().getMonth() == Calendar.getInstance().get(Calendar.MONTH) + 1)
        {
            System.out.println("It's your birthday! You are eligble for a $100 bonus\n" );
        }
        
        else
        {
            System.out.println("It's not your birthday therefore, no bonus for you :(\n");
        }
    }
    
    for (int j = 0; j < employees.length; j++)
    {
        System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());
    }

    }
}
