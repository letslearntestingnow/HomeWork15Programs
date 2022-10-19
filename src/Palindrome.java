import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        // Create a scanner object
        Scanner scannerObj = new Scanner(System.in);

        // Get input
        System.out.println("\n");
        System.out.print("Enter a number: ");
        String strInput = scannerObj.nextLine();

        // Initialise a string variable to store the reverse of the inout string
        String strReverse = "";
        // Initialise a flag to check if it is a Palindrome
        boolean bIsPalindrome = false;

        // Run the loop until you reach the beginning of the string, starting from the end
        for (int i = strInput.length() - 1; i >= 0; i--)
        {
            // starting at the end, store the string in reverse order, one character at a time
            strReverse = strReverse + strInput.charAt(i);
            // if the string in reverse order is the same as user input string then flag it as a Palindrome
            if (strInput.equals(strReverse)) bIsPalindrome = true;
        }

        // Print output
        if (bIsPalindrome)
            System.out.println("It IS a Palindrome");
        else
            System.out.println("It is NOT a Palindrome");

        // Close scanner object
        scannerObj.close();
    }
}