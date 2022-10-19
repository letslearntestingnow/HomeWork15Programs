import java.util.Scanner;

public class ReverseFiveDigit
{
    public static void main(String[] args)
    {
        // create a scanner object
        Scanner scannerObj = new Scanner(System.in);

        // Get input
        System.out.println("\n");
        System.out.print("Please enter a number: ");
        int iNumber = scannerObj.nextInt();

        int iDuplicateNumber = iNumber;
        int iCount = 0;

        // Check total number of digits
        while (iDuplicateNumber != 0)
        {
            // Remove the last digit from the number
            iDuplicateNumber /= 10;

            // Increment counter
            iCount++;
        }

        // Stop the program if the number is not a 5-digit number
        if (iCount != 5)
        {
            System.out.println("Error: The number entered is not a 5 digit number.");
            return;
        }

        // Initialise reverse and temp variables
        int iReverse =0;

        // Continue the loop until iNumber becomes 0
        while (iNumber > 0)
        {
            // Find the last digit of the iNumber
            int iRemainder = iNumber % 10;

            // Calculate reverse - Multiply by 10 and add remainder
            iReverse = iReverse * 10 + iRemainder;

            // Remove the last digit from iNumber
            iNumber = iNumber / 10;
        }

        // Print the number after reversal
        System.out.println("The number after reversing is: " + iReverse);

        // close the scanner object
        scannerObj.close();
    }
}
