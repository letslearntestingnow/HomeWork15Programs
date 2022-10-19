import java.util.Scanner;

public class SumofOddEven
{
    public static void main(String[] args)
    {
        // Create scanner object
        Scanner scannerObj = new Scanner(System.in);

        // Get input
        System.out.println("\n");
        System.out.print("Enter a 5 digit number: ");
        int iNumber = scannerObj.nextInt();
        int iDuplicateNumber = iNumber;

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

        int iLastDigit = 0 , iOddSum = 0, iEvenSum = 0;

        // restore the value of iNumber
        iNumber = iDuplicateNumber;

        while (iNumber != 0)
        {
            // Get the last digit
            iLastDigit = iNumber % 10;

            // Check if the last digit is an even number. If yes, add it to the Even sum
            if (iLastDigit % 2 == 0)
                iEvenSum += iLastDigit;
            // else add it to the Odd sum
            else
                iOddSum += iLastDigit;

            // Remove the last digit from the number
            iNumber /= 10;
        }

        // Print the sum of Even digits
        System.out.println("The sum of even digits of the number " + iDuplicateNumber + " is " + iEvenSum);

        // Print the sum of Odd digits
        System.out.println("The sum of odd digits of the number " + iDuplicateNumber + " is " + iOddSum);

        // Close scanner object
        scannerObj.close();
    }
}
