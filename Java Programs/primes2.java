import java.util.*;
import java.util.Scanner;


public class primes2 {


public static void main(String[] args) {


Scanner input = new Scanner(System.in);

        System.out.print("Enter the upper limit: ");

        int num = 500;

        int[] primes = new int[num];
        char[] prime2 = new char[num];

        primes[0] = 2;

       

        for (int i = 2; i < num; i++) 

        { // loops through the numbers 

       

        if (!isPrime(i + 1)) 

        {

        primes[i] = i + 1;

        } 

       

        else {

       

        }

        }

System.out.println();

StringBuffer sbfNumbers = new StringBuffer();
String strSeparator = " ";
String Str = " ";

                for (int k = 0; k < primes.length; k++)
                {
                    
                    if (primes[k] != 0)
                    {
                    for (int j = 0; j <9; j++)
                    {
                        sbfNumbers.append(strSeparator).append(primes[k]);
                    System.out.print(sbfNumbers);
                    sbfNumbers = sbfNumbers.replaceAll("0", " ");
                       // System.out.print(primes[k] + ",");
                        k++;
                        if (primes[k] == 0)
                        System.out.print(" ");
                        
                    }
                    System.out.println();
                    }
                
                }
       System.out.print(sbfNumbers);
/*
       for (int i = 0; i < primes.length; i++) 
        {
            if (primes[i] != 0)
            {

                System.out.print(primes[i] + ", ");
                
               
            
            }

        }*/

       
    }


public static boolean isPrime(int x){

boolean notprime = false;

for (int i = 2; i < x; i++) {

if (x % i == 0) {

notprime = true;

break;

}

}

return notprime;

}

}
