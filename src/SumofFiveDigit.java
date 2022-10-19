import java.util.Scanner;

public class SumofFiveDigit
{
    public static void main(String[] args)
    {
        // Create scanner object
        Scanner scannerObj = new Scanner(System.in);

        // Get input
        System.out.println("\n");
        System.out.print("Enter a 5 digit number: ");
        int iNumber = scannerObj.nextInt();

        // Create a copy of the input number
        int iDuplicateNumber = iNumber;
        int iCount = 0;

        // Check total number of digits
        while (iNumber != 0)
        {
            // Remove the last digit from the number
            iNumber /= 10;

            // Increment counter
            iCount++;
        }

        // Stop the program if the number is not a 5-digit number
        if (iCount != 5)
        {
            System.out.println("Error: The number entered is not a 5 digit number.");
            return;
        }

        int iLastDigit = 0 , iSum = 0;

        // Restore the value of iNumber
        iNumber = iDuplicateNumber;

        while (iNumber != 0)
        {
            // Get the last digit
            iLastDigit = iNumber % 10;

            // Add the last digit to the sum
            iSum += iLastDigit;

            // Remove the last digit from the number
            iNumber /= 10;
        }

        // Print the sum of digits
        System.out.println("The sum of digits of the number " + iDuplicateNumber + " is " + iSum);

        // Close scanner object
        scannerObj.close();
    }
}
