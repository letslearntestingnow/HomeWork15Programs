import java.util.Scanner;

public class CountAInAString
{
    public static void main(String[] args)
    {
        // Create a scanner object
        Scanner scannerObj = new Scanner(System.in);

        // Get input
        System.out.println("\n");
        System.out.print("Enter a string: ");
        String strGivenString = scannerObj.nextLine();

        // Initialise the counter variable to 0
        int iCounter = 0;

        // Run the loop until the end of the string
        for (int i = 0; i < strGivenString.length(); i++)
        {
            // If an 'a' is encountered, increment the counter
            if (strGivenString.charAt(i) == 'a')  iCounter++;
        }

        // Print the count
        System.out.println("The number of 'a' found in the given string are: " + iCounter);

        // Close scanner object
        scannerObj.close();
    }
}
