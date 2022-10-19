import java.util.Scanner;

public class CheckPrimeNumber
{
    public static void main(String[] args)
    {
        // Create scanner object to get input
        Scanner scannerObj = new Scanner(System.in);

        // Get input
        System.out.println("\n");
        System.out.print("Enter the number to be checked: ");
        int iNumber = scannerObj.nextInt();

        // Initialise the Prime flag to true
        boolean bPrime = true;

        // Continue the loop until half of the input number
        for(int i = 2; i <= iNumber/2; ++i)
        {
            // If the number is fully divisible by another number, set Prime flag to false
            if(iNumber % i == 0)
            {
                bPrime = false;
                break;
            }
        }

        // Print the result
        if (bPrime)
            System.out.println(iNumber + " IS a prime number.");
        else
            System.out.println(iNumber + " is NOT a prime number.");
    }
}
