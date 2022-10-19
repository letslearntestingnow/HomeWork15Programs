import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner scannerObj = new Scanner(System.in);

        // Get input
        System.out.println("\n");
        System.out.print("Enter a number : ");
        int iNumber = scannerObj.nextInt();

        // Print multiplication table for iNumber
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(iNumber + " x " + i + " = " + iNumber * i);
        }

        // Close scanner object
        scannerObj.close();
    }
}
