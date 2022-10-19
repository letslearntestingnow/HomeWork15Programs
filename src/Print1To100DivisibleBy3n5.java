public class Print1To100DivisibleBy3n5
{
    public static void main(String[] args)
    {
        // Run the loop until 100
        for (int i = 1; i <= 100; i++)
        {
            // Print any number which is divisible by 3
            if (i % 3 == 0)
                System.out.print(i + "\t");
        }

        System.out.println("\n");

        // Run the loop until 100
        for (int i = 1; i <= 100; i++)
        {
            // Print any number which is divisible by 5
            if (i % 5 == 0)
                System.out.print(i + "\t");
        }
    }
}
