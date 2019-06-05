import java.util.Scanner;

public class reverse
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please input a string: ");
        String sentence = scan.nextLine();
        
        String[] tokens = sentence.split(" ");
        
        for (int i = tokens.length-1; i >= 0; i--)
        {
            System.out.printf("%s ", tokens[i]);
        }
    }
}
