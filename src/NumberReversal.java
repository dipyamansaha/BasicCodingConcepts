// REVERSING AN ENTERED NUMBER

import java.util.Scanner;

public class NumberReversal
{
    static int ReverseNumStr(int num)
    {
        return Integer.parseInt(new StringBuffer(Integer.toString(num)).reverse().toString());
    }

    static int ReverseNum(int num)
    {
        int revNum = 0;

        while(num > 0)
        {
            revNum = (revNum*10 + num%10);
            num /= 10;
        }

        return revNum;
    }

    public static void main(String[] args)
    {
        System.out.println("REVERSING AN ENTERED NUMBER...\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("\n1. The reversed number: " + ReverseNum(num));
        System.out.println("2. The reversed number: " + ReverseNumStr(num));
    }
}