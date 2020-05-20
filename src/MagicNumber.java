// CHECKING IF AN ENTERED NUMBER IS A MAGIC NUMBER

import java.util.Scanner;

public class MagicNumber
{
    static boolean IsMagicShortcut(int num)
    {
        return ((num % 9) == 1);
    }

    static boolean IsMagic(int num)
    {
        int sum = 0;

        while(num > 0 || sum > 9)
        {
            if(num == 0)
            {
                num = sum;
                sum = 0;
            }

            sum += (num % 10);
            num /= 10;
        }

        return (sum == 1);
    }

    public static void main(String[] args)
    {
        System.out.println("CHECKING IF AN ENTERED NUMBER IS A MAGIC NUMBER...\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(IsMagic(num))
            System.out.println("\nThe entered number is a Magic number!");
        else
            System.out.println("\nThe entered number is NOT a Magic number!");

        if(IsMagicShortcut(num))
            System.out.println("Shortcut: The entered number is a Magic number!");
        else
            System.out.println("Shortcut: The entered number is NOT a Magic number!");
    }
}