// DISPLAYING THE FIBONACCI SERIES UP TO AN ENTERED NUMBER OF TERMS

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries
{
    static int[] Fibonacci(int num)
    {
        int[] FibArr = new int[num];

        FibArr[0] = 0;
        FibArr[1] = 1;

        for(int i = 2; i < num; i++)
            FibArr[i] = FibArr[i - 2] + FibArr[i - 1];

        return FibArr;
    }

    public static void main(String[] args)
    {
        System.out.println("FINDING THE FACTORIAL OF AN ENTERED NUMBER...\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int num = sc.nextInt();

        System.out.println("\nThe Fibonacci series up to " + num + " terms: " + Arrays.toString(Fibonacci(num)));
    }
}
