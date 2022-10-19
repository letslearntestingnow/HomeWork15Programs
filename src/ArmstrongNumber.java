import java.util.Scanner;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        // Create a scanner object
        Scanner scannerObj = new Scanner(System.in);

        // Get input
        System.out.println("\n");
        System.out.print("Enter the number: ");
        int iNumber = scannerObj.nextInt();

        // Assign the input number into a temp variable
        int iTemp = iNumber, iDigits = 0, iLast = 0, iSum = 0;

        // Find the number of digits for the given number
        while (iTemp > 0)
        {
            iTemp /= 10;
            iDigits++;
        }

        // We need the temp variable to be back at the initial value, the user input number
        iTemp = iNumber;

        // Calculate the sum of each digit to the power of number of digits
        while (iTemp > 0)
        {
            // Get the last digit
            iLast = iTemp % 10;

            // Calculate - Last digit to the power of the number of digits and add it to sum
            iSum += (Math.pow(iLast,iDigits));

            // Remove the last digit from temp variable
            iTemp /= 10;
        }

        // If the sum is same as the input number, it is an Armstrong number
        if (iNumber == iSum) { System.out.println("The given number IS an Armstrong number."); }
        else { System.out.println("The given number is NOT an Armstrong number."); }

        // Close the scanner object
        scannerObj.close();
    }
}
