// FINDING THE GCD/HCF OF AN ENTERED SET OF NUMBERS

import java.util.Scanner;

public class GCD
{
    static int GCDFinderArr(int[] numArr)
    {
        int GCD = numArr[0];
        for(int i = 1; i < numArr.length; i++)
            GCD = RecursiveGCDFinder(numArr[i], GCD);

        return GCD;
    }

    static int RecursiveGCDFinder(int num1, int num2)
    {
        if(num2 == 0)
            return num1;

        return RecursiveGCDFinder(num2, (num1 % num2));
    }

    static int GCDFinderAlternative(int num1, int num2)
    {
        if((num1 == 0) || (num2 == 0))
            return Math.max(num1, num2);

        while(num1 != num2)
            if (num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;

        return num2;
    }

    static int GCDFinder(int num1, int num2)
    {
        if((num1 == 0) || (num2 == 0))
            return Math.max(num1, num2);

        int GCD = 1;
        for(int i = 1; i <= num1 && i <= num2; i++)
            if(num1%i==0 && num2%i==0)
                GCD = i;

        return GCD;
    }

    public static void main(String[] args)
    {
        System.out.println("FINDING THE GCD/HCF OF AN ENTERED SET OF NUMBERS...\n");

        Scanner sc = new Scanner(System.in);

        System.out.println("1. FINDING THE GCD OF A PAIR OF NUMBERS:\n");

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("\nThe GCD of the entered numbers: " + GCDFinder(num1, num2));
        System.out.println("Alternative - The GCD of the entered numbers: " + GCDFinderAlternative(num1, num2));
        System.out.println("The GCD of the entered numbers, recursively: " + GCDFinderAlternative(num1, num2));

        System.out.println("\n2. FINDING THE GCD OF AN ARRAY OF NUMBERS:\n");

        System.out.print("How many numbers of do you wanna enter? ");
        int n = sc.nextInt();

        int[] numArr = new int[n];

        System.out.println("Enter the " + n + " numbers:");
        for(int i = 0; i < n; i++)
            numArr[i] = sc.nextInt();

        System.out.println("\nThe GCD of the entered array of numbers: " + GCDFinderArr(numArr));
    }
}