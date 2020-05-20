// CHECKING IF AN ENTERED NUMBER IS A PRIME NUMBER OR A COMPOSITE NUMBER

import java.util.Scanner;

public class PrimeOrCompositeNumber
{
    static boolean IsPrimeAlternative(int num)
    {
        if(num == 2)
            return true;

        if((num % 2) == 0)
            return false;

        for(int i = 3; i <= Math.sqrt(num); i+=2)
            if((num % i) == 0)
                return false;

        return true;
    }

    static boolean IsPrime(int num)
    {
        for(int i = 2; i <= num/2; i++)
            if((num % i) == 0)
                return false;

        return true;
    }

    public static void main(String[] args)
    {
        System.out.println("CHECKING IF AN ENTERED NUMBER IS A PRIME NUMBER OR A COMPOSITE NUMBER...\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num == 0 || num == 1)
        {
            System.out.println("\nThe entered number is NEITHER a Prime NOR a Composite number!");
            System.exit(0);
        }
        else if(IsPrime(num))
            System.out.println("\nThe entered number is a Prime number!");
        else
            System.out.println("\nThe entered number is a Composite number!");

        if(IsPrimeAlternative(num))
            System.out.println("Alternative - The entered number is a Prime number!");
        else
            System.out.println("Alternative - The entered number is a Composite number!");
    }
}