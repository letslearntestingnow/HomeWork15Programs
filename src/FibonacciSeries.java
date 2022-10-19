import java.util.Scanner;

public class FibonacciSeries
{
    public static void main(String[] args)
    {
        // Create a scanner object
        Scanner scannerObj = new Scanner(System.in);

        // Get input for Limiter
        System.out.println("\n");
        System.out.print("Enter the limit for Fibonacci Series: ");
        int iLimiter = scannerObj.nextInt();

        System.out.println("The Fibonacci Series is as follows: ");

        // Variables to use for calculation
        int iPreviousNumber = 0;
        int iNextNumber = 1;

        // Run the loop until the limiter
        for (int i = 0; i < iLimiter; i++)
        {
            // Print the fibonacci series
            System.out.print(iPreviousNumber + " ");

            // Every iteration, the sum of first and second numbers is calculated,
            int iSum = iPreviousNumber + iNextNumber;

            // second number is assigned to the first number
            iPreviousNumber = iNextNumber;

            // and the sum of the last two numbers is assigned to the second number
            iNextNumber = iSum;
        }
    }
}
