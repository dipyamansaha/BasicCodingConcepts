// FINDING THE FACTORIAL OF AN ENTERED NUMBER

import java.util.Scanner;

public class Factorial
{
    static int RecursiveFactorialFinder(int num)
    {
        return ((num == 0 || num == 1) ? 1 : (num * RecursiveFactorialFinder(num-1)));
    }

    static int FactorialFinder(int num)
    {
        int fact = 1;

        for(int i = 2; i <= num; i++)
            fact *= i;

        return fact;
    }

    public static void main(String[] args)
    {
        System.out.println("FINDING THE FACTORIAL OF AN ENTERED NUMBER...\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("\n1. The Factorial of the entered number: " + FactorialFinder(num));
        System.out.println("2. The Factorial of the entered number, recursively: " + RecursiveFactorialFinder(num));
    }
}