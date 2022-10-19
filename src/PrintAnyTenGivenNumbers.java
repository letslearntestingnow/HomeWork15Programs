import java.util.Scanner;

public class PrintAnyTenGivenNumbers
{
    public static void main(String[] args)
    {
        // Create a scanner object
        Scanner scannerObj = new Scanner(System.in);

        System.out.print("\n");

        // Get two numbers
        System.out.print("Enter the first number: ");
        int iFirstNum = scannerObj.nextInt();

        System.out.print("Enter the second number: ");
        int iSecondNum = scannerObj.nextInt();

        // check where to start and where to end. We will start with the lower of the two numbers.
        if( iFirstNum > iSecondNum )
        {
            // and the gap can not be more than 10
            if ( (iFirstNum - iSecondNum) > 10 )
                System.out.println("Invalid range!");
            else
                for (int i = iSecondNum; i <= iFirstNum; i++)
                    System.out.print(i + "\t");
        }
        // check that the gap can not be more than 10
        else if ( (iSecondNum - iFirstNum) > 10 )
            System.out.println("Invalid range!");
        else
            for (int i = iFirstNum; i <= iSecondNum; i++)
                System.out.print(i + "\t");

            // close the scanner object
        scannerObj.close();
    }
}
