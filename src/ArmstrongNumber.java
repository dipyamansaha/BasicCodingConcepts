// CHECKING IF AN ENTERED NUMBER IS AN ARMSTRONG/NARCISSISTIC/PLUS-PERFECT NUMBER

import java.util.Scanner;

public class ArmstrongNumber
{
    static int NumOfDigits(int num)
    {
        int numOfDigits = 0;

        for(; num != 0; num /= 10, ++numOfDigits);

        return numOfDigits;
    }

    static boolean IsArmstrong(int num)
    {
        int orgNum = num;

        int order = NumOfDigits(num);
        int result = 0;

        for(; orgNum != 0; orgNum /= 10)
        {
            int digit = orgNum % 10;
            result += Math.pow(digit, order);
        }

        return (result == num);
    }

    public static void main(String[] args)
    {
        System.out.println("CHECKING IF AN ENTERED NUMBER IS AN ARMSTRONG/NARCISSISTIC/PLUS-PERFECT NUMBER...\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(IsArmstrong(num))
            System.out.println("\nThe entered number is an Armstrong number!");
        else
            System.out.println("\nThe entered number is NOT an Armstrong number!");
    }
}