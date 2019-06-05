import java.util.Scanner;

public class hw1
{
    public static void main(String[] args)
    {
        int num, number, digit, sum = 0;
        int product = 0, avg = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter three numbers: ");
        num = in.nextInt();
        number = in.nextInt();
        digit = in.nextInt();
        
        sum = num+number+digit;
        System.out.printf("The sum is: %d %n", sum);
        
        product = num*digit*number;
        System.out.printf("The product is: %d %n", product);
        
        avg = sum/3;
        System.out.printf("The average is: %d %n", avg);
        
            int max = num;
            if (number > max)
                max = number;
            if (digit > max)
                max = digit;
        
        System.out.printf("The biggest number is: %d %n", max);
        
            int min = num;
            if (number < min)
                min = number;
            if (digit < min)
                min = digit;
        
        System.out.printf("The lowest number is: %d %n", min);
    }
}
