import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class name
{
    public static void main(String[] args)
    {
        Scanner Scan = new Scanner(System.in);
        double num = 0;
        HashSet<String> h = new HashSet<String>();
        String answer;
        
        System.out.println("Enter a number: ");
        num = Scan.nextInt();
        
        for (int i = 0; i < num; i++)
        {
            System.out.println("Enter a first name: ");
            answer = Scan.nextLine();
            h.add(answer);
        }
        
        for (String x : h)
        {
            System.out.printf("%s%n", x);
        }
    }
}
