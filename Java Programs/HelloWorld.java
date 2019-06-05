import java.util.Scanner;
public class HelloWorld{

     public static void main(String []args)
     {
         Scanner scan = new Scanner (System.in);
         
         int count = 0;
         String answer = "";
         String in = "";
         
         while (count != 10)
         {
             System.out.print("Enter a string: ");
             in = scan.nextLine();
             
             in = in.replace('e', 'i');
             
             answer = answer + in + " ";
             count++;
         }
         
         System.out.printf("The string is: %s", answer);
     }
}
