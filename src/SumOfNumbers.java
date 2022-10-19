import java.util.Scanner;

public class SumOfNumbers
{
    public static void main(String[] args)
    {
        // Create scanner object
        Scanner scannerObj = new Scanner(System.in);

        // Get input
        System.out.println("\n");
        System.out.print("Enter a number : ");
        int iNumber = scannerObj.nextInt();

        // Calculate Sum of the numbers until iNumber
        int iSum = 0;
        for (int i = 1; i <= iNumber; i++)
            iSum += i;

        // Print the result
        System.out.println("The sum of first " + iNumber + " numbers is " + iSum);

        // Close scanner object
        scannerObj.close();
    }
}
