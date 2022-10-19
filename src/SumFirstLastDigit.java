import java.util.Scanner;

public class SumFirstLastDigit
{
    public static void main(String[] args)
    {
        // create a scanner object
        Scanner scannerObj = new Scanner(System.in);

        // Get input
        System.out.println("\n");
        System.out.print("Enter a 5 digit number: ");
        int iNumber = scannerObj.nextInt();

        // Create a copy of the inout number
        int iDuplicateNumber = iNumber;

        // Find the last digit
        int iLastDigit = iNumber % 10;

        int iCount = 0;

        // Check total number of digits
        while (iNumber != 0)
        {
            // Remove the last digit from the number
            iNumber /= 10;

            // Increment the counter
            iCount++;
        }

        // Stop the program if the number is not a 5-digit number
        if (iCount != 5)
        {
            System.out.println("Error: The number entered is not a 5 digit number.");
            return;
        }

        int iSum = 0;

        // Calculate the divisor
        int iDivisor = (int)Math.pow(10,iCount-1);

        // Find the first digit
        int iFirstDigit = iDuplicateNumber / iDivisor;

        // Calculate the sum
        iSum = iFirstDigit + iLastDigit;


        // Print the sum of digits
        System.out.println("The sum of First and Last digits of the number " + iDuplicateNumber + " is " + iSum);

        // Close scanner object
        scannerObj.close();
    }
}
