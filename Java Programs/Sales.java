public class Sales
{

public static void main(String[] args)
{
    // Array to hold the salary of the salesman and holds the total amount of sales
	int salesArray[] = {5000, 7000, 5500, 10500, 2000, 4000, 4500, 8000, 11000, 6000};
    double [] salary = new double [10];
    
    int count = 0;      // Variable to count how many salesman make $200-299
    int counter = 0;    // Variable to count how many salesman make $300-399
    int total = 0;      // Variable to count how many salesman make $400-499
    int sum = 0;        // Variable to count how many salesman make $500-599
    int summary = 0;    // Variable to count how many salesman make $600-699
    int con = 0;        // Variable to count how many salesman make $700-799
    int fin = 0;        // Variable to count how many salesman make $800-899
    int com = 0;        // Variable to count how many salesman make $900-999
    int whole = 0;      // Variable to count how many salesman make $1000 & more
    
    // Adds up the salesmen salary and store it in an array
    
		for (int i = 0; i < 10; i++)
		{
            salary[i] = (salesArray[i] * 0.09) + 200;
		}

    // Counts how many salesman make this salary
    
    for (int i = 0; i < 10; i++)
    {
        if (salary[i] >= 200 && salary[i] <= 299)
        {
            count++;
        }
        
        else if (salary[i] >= 300 && salary[i] <= 399)
        {
            counter++;
        }
        
        else if (salary[i] >= 400 && salary[i] <= 499)
        {
            total++;
        }
        
        else if (salary[i] >= 500 && salary[i] <= 599)
        {
            sum++;
        }
        
        else if (salary[i] >= 600 && salary[i] <= 699)
        {
            summary++;
        }
        
        else if (salary[i] >= 700 && salary[i] <= 799)
        {
            con++;
        }
        
        else if (salary[i] >= 800 && salary[i] <= 899)
        {
            fin++;
        }
        
        else if (salary[i] >= 900 && salary[i] <= 999)
        {
            com++;
        }
        
        else if (salary[i] >= 1000)
        {
            whole++;
        }
    }
    
    // Displays the summary
    
    System.out.println("The summary for salaries of salesman: \n");
    System.out.println("A. The number of salaries ranging $200-299: ");
    System.out.print(count);
    System.out.println("\n");
    
    System.out.println("B. The number of salaries ranging $300-399: ");
    System.out.print(counter);
    System.out.println("\n");
    
    System.out.println("C. The number of salaries ranging $400-499: ");
    System.out.print(total);
    System.out.println("\n");
    
    System.out.println("D. The number of salaries ranging $500-599: ");
    System.out.print(sum);
    System.out.println("\n");
    
    System.out.println("E. The number of salaries ranging $600-699: ");
    System.out.print(summary);
    System.out.println("\n");
    
    System.out.println("F. The number of salaries ranging $700-799: ");
    System.out.print(con);
    System.out.println("\n");
    
    System.out.println("G. The number of salaries ranging $800-899: ");
    System.out.print(fin);
    System.out.println("\n");
    
    System.out.println("H. The number of salaries ranging $900-1000: ");
    System.out.print(com);
    System.out.println("\n");
    
    System.out.println("I. The number of salaries ranging $1000 & up: ");
    System.out.print(whole);
    System.out.println("\n");
}
}
