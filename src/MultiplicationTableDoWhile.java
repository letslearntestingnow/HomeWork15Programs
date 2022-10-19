import java.util.Scanner;

public class MultiplicationTableDoWhile
{
    public static void main(String[] args)
    {
        // Create a scanner object
        Scanner scannerObj = new Scanner(System.in);

        // Get input
        System.out.println("\n");
        System.out.print("Enter the number up to which the table should be printed: ");
        int iMaxNum = scannerObj.nextInt();

        // We will be printing multiplication table for 1, 2 and 3
        int iNumber1 = 1, iNumber2 = 2, iNumber3 = 3;
        int iMultiple = 1;

        // Run the loop until the iMaxNum (user input)
       do
       {
           System.out.println( (iNumber1 * iMultiple) + "\t" + (iNumber2 * iMultiple) + "\t" + (iNumber3 * iMultiple));
           iMultiple++;
       }while(iMultiple <= iMaxNum);

       // close the scanner object
       scannerObj.close();
    }
}
