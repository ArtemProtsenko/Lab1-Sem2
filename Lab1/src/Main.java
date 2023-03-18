import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);

        float C = 24 % 3;
        float S = 0;

        boolean hasError = false;

        System.out.println("C2 = " + 24 % 2 + ", O1 = '+'.");
        System.out.println("C = C3 = " + C + ".");
        System.out.println("C5 = " + 24 % 5 + ", O2 = '-'.");
        System.out.println("C7 = " + 24 % 7 + ", i and j - 'long'.");

        System.out.println("Enter a: ");
        String strA = myScanner.nextLine();

        System.out.println("Enter n: ");
        String strN = myScanner.nextLine();

        System.out.println("Enter b: ");
        String strB = myScanner.nextLine();

        System.out.println("Enter m: ");
        String strM = myScanner.nextLine();

        if (strA.matches("[0-9]+") && strN.matches("[0-9]+") && strB.matches("[0-9]+") && strM.matches("[0-9]+"))
        {
            long a = Long.parseLong(strA);
            long n = Long.parseLong(strN);
            long b = Long.parseLong(strB);
            long m = Long.parseLong(strM);

            if(a > n || b > m)
            {
                hasError = true;
                System.out.println("Error: Wrong range.");
            }
            else
            {
                for(long i = a; i <= n; i++)
                {
                    for(long j = b; j <= m; j++)
                    {
                        if(i == -C)
                        {
                            hasError = true;
                            System.out.println("Error: Division by zero.");
                            break;
                        }
                        else
                        {
                            S += ((i - j) / (i + C));
                        }
                    }
                }
            }
        }
        else
        {
            hasError = true;
            System.out.println("Error: Input is not a number.");
        }

        if(!hasError)
        {
            System.out.println("S = " + S + ".");
        }
    }
}