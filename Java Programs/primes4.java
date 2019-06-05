import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;


public class Primes {


public static void main(String[] args) {


Scanner input = new Scanner(System.in);

        System.out.print("Enter the upper limit: ");

        int num = 500;

        int[] primes = new int[num];
        int[] prime2 = new int[num];

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

for(int i = 0; i < num; i++) 
{    
   if (primes[i] != 0)
     System.out.print(primes[i]+ ((i%10==8) ? "\n" : " "));
}

/*
                for (int k = 0; k < primes.length; k++)
                {
                    if (primes[k] != 0)
                    {
                    for (int j = 0; j <9; j++)
                    {
                        if(primes[k] != 0)
                        {
                        System.out.print(primes[k] + ((k%10==9) ? "\n" : " "));
                        k++;
                        }
                        
                    }
                   
                    }
                
                }
                
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