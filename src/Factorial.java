import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        // Create scanner object
        Scanner scannerObj = new Scanner(System.in);

        // Get input
        System.out.println("\n");
        System.out.print("Enter a number : ");
        int iNumber = scannerObj.nextInt();

        // Initialise the variable factorial to 1
        int iFactorial = 1;

        // Run the loop for iNumber of times
        for (int i = 1; i <= iNumber; i++)
        {
            iFactorial *= i;
        }

        // Print the factorial
        System.out.println("The factorial of " + iNumber + " is " + iFactorial);
    }
}
