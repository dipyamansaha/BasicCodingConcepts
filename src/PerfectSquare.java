// CHECKING IF AN ENTERED NUMBER IS A PERFECT SQUARE

import java.util.Scanner;

public class PerfectSquare
{
    static boolean IsPerfectSquareAlternative(int num)
    {
        double squareRoot = Math.sqrt(num);

        return ((squareRoot - Math.floor(squareRoot)) == 0);
    }

    static boolean IsPerfectSquare(int num)
    {
        if(num == 0)
            return true;

        for(int i = 1; (i * i) <= num; i++)
            if(((num % i) == 0) && ((num / i) == i))
                return true;

        return false;
    }

    public static void main(String[] args)
    {
        System.out.println("CHECKING IF AN ENTERED NUMBER IS A PERFECT SQUARE...\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(IsPerfectSquare(num))
            System.out.println("\nThe entered number is a Perfect Square!");
        else
            System.out.println("\nThe entered number is NOT a Perfect Square!");

        if(IsPerfectSquareAlternative(num))
            System.out.println("Alternative: The entered number is a Perfect Square!");
        else
            System.out.println("Alternative: The entered number is NOT a Perfect Square!");
    }
}