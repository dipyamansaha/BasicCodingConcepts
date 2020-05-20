// REVERSING AN ENTERED STRING

import java.util.Scanner;

public class StringReversal
{
    static String ReverseStrSbl(String str)
    {
        StringBuilder sbl = new StringBuilder(str);
        sbl.reverse();

        return sbl.toString();
    }

    static String ReverseStrSbf(String str)
    {
        StringBuffer sbf = new StringBuffer(str);
        sbf.reverse();

        return sbf.toString();
    }

    static String ReverseStrCharArr(String str)
    {
        char[] charArrStr = str.toCharArray();

        for(int i = 0; i < str.length()/2; i++)
        {
            char temp = charArrStr[i];
            charArrStr[i] = charArrStr[str.length() - i - 1];
            charArrStr[str.length() - i - 1] = temp;
        }

        return String.valueOf(charArrStr);
    }

    static String ReverseStr(String str)
    {
        String revStr = "";

        for(int i = (str.length() - 1); i >= 0; i--)
            revStr += str.charAt(i);

        return revStr;
    }

    public static void main(String[] args)
    {
        System.out.println("REVERSING AN ENTERED STRING...\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("\n1. The reversed string: " + ReverseStr(str));
        System.out.println("2. The reversed string: " + ReverseStrCharArr(str));
        System.out.println("3. The reversed string: " + ReverseStrSbf(str));
        System.out.println("4. The reversed string: " + ReverseStrSbl(str));
    }
}