// CHECKING IF AN ENTERED NUMBER IS A PALINDROME

import java.util.Scanner;

public class PalindromeNumber
{
    static int ReverseNum(int num)
    {
        int revNum = 0;

        while(num > 0)
        {
            revNum = (revNum * 10) + (num % 10);
            num /= 10;
        }

        return revNum;
    }

    static boolean IsPalindrome(int num)
    {
        return (ReverseNum(num) == num);
    }

    public static void main(String[] args)
    {
        System.out.println("CHECKING IF AN ENTERED NUMBER IS A PALINDROME...\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(IsPalindrome(num))
            System.out.println("\nThe entered number is a Palindrome!");
        else
            System.out.println("\nThe entered number is NOT a Palindrome!");
    }
}