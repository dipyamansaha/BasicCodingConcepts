// CHECKING IF AN ENTERED NUMBER IS A PERFECT NUMBER

import java.util.Scanner;

public class PerfectNumber
{
    static boolean IsPerfectAlternative(int num)
    {
        if((num == 0) || (num == 1))
            return false;

        int sum = 1;
        for(int i = 2; i <= Math.sqrt(num); i++)
        {
            if((num % i) == 0)
            {
                if(Math.pow(i, 2) != num)
                    sum += (i + (num / i));
                else
                    sum += i;
            }
        }

        return (sum == num);
    }

    static boolean IsPerfect(int num)
    {
        if((num == 0) || (num == 1))
            return false;

        int sum = 1;

        for(int i = 2; i <= num/2; i++)
            if ((num % i) == 0)
                sum += i;

        return (sum == num);
    }

    public static void main(String[] args)
    {
        System.out.println("CHECKING IF AN ENTERED NUMBER IS A PERFECT NUMBER...\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(IsPerfect(num))
            System.out.println("\nThe entered number is a Perfect number!");
        else
            System.out.println("\nThe entered number is NOT a Perfect number!");

        if(IsPerfectAlternative(num))
            System.out.println("Alternative: The entered number is a Perfect number!");
        else
            System.out.println("Alternative: The entered number is NOT a Perfect number!");
    }
}