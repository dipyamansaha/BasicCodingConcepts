// FINDING THE LCM OF AN ENTERED SET OF NUMBERS

import java.util.Scanner;

public class LCM
{
    static int LCMFinderArr(int[] numArr)
    {
        int LCM = numArr[0];
        for(int i = 1; i < numArr.length; i++)
            LCM = ((LCM * numArr[i]) / RecursiveGCDFinder(LCM, numArr[i]));

        return LCM;
    }

    static int RecursiveGCDFinder(int num1, int num2)
    {
        if(num2 == 0)
            return num1;

        return RecursiveGCDFinder(num2, (num1 % num2));
    }

    static int LCMFinderFormula(int num1, int num2)
    {
        return ((num1 * num2) / RecursiveGCDFinder(num1, num2));
    }

    static int LCMFinderAlternative(int num1, int num2)
    {
        if((num1 == 0) || (num2 == 0))
            return 0;

        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        int LCM = max;
        while((LCM % min) != 0)
        {
            LCM += max;
        }

        return LCM;
    }

    static int LCMFinder(int num1, int num2)
    {
        if((num1 == 0) || (num2 == 0))
            return 0;

        int LCM = Math.max(num1, num2);
        while(true)
        {
            if(((LCM % num1) == 0) && ((LCM % num2) == 0))
                return LCM;

            LCM++;
        }
    }

    public static void main(String[] args)
    {
        System.out.println("FINDING THE LCM OF AN ENTERED SET OF NUMBERS...\n");

        Scanner sc = new Scanner(System.in);

        System.out.println("1. FINDING THE LCM OF A PAIR OF NUMBERS:\n");

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("\nThe LCM of the entered numbers: " + LCMFinder(num1, num2));
        System.out.println("Alternative - The LCM of the entered numbers: " + LCMFinderAlternative(num1, num2));
        System.out.println("Using the GCD-LCM relation - The LCM of the entered numbers: " + LCMFinderFormula(num1, num2));

        System.out.println("\n2. FINDING THE LCM OF AN ARRAY OF NUMBERS:\n");

        System.out.print("How many numbers of do you wanna enter? ");
        int n = sc.nextInt();

        int[] numArr = new int[n];

        System.out.println("Enter the " + n + " numbers:");
        for(int i = 0; i < n; i++)
            numArr[i] = sc.nextInt();

        System.out.println("\nThe LCM of the entered array of numbers: " + LCMFinderArr(numArr));
    }
}
